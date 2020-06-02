/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *	 http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package ru.obvilion.box.backends.headless;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.GraphicsEnvironment;

import ru.obvilion.box.Box;
import ru.obvilion.box.constructors.Net;
import ru.obvilion.box.net.NetJavaImpl;
import ru.obvilion.box.net.NetJavaServerSocketImpl;
import ru.obvilion.box.net.NetJavaSocketImpl;
import ru.obvilion.box.net.ServerSocket;
import ru.obvilion.box.net.ServerSocketHints;
import ru.obvilion.box.net.Socket;
import ru.obvilion.box.net.SocketHints;

/** Headless implementation of the {@link Net} API, based on LWJGL implementation
 * @author acoppes
 * @author Jon Renner */
public class HeadlessNet implements Net {

	NetJavaImpl netJavaImpl;

	public HeadlessNet(HeadlessApplicationConfiguration configuration) {
		netJavaImpl = new NetJavaImpl(configuration.maxNetThreads);
	}

	@Override
	public void sendHttpRequest (HttpRequest httpRequest, HttpResponseListener httpResponseListener) {
		netJavaImpl.sendHttpRequest(httpRequest, httpResponseListener);
	}

	@Override
	public void cancelHttpRequest (HttpRequest httpRequest) {
		netJavaImpl.cancelHttpRequest(httpRequest);
	}
	
	@Override
	public ServerSocket newServerSocket (Protocol protocol, String hostname, int port, ServerSocketHints hints) {
		return new NetJavaServerSocketImpl(protocol, hostname, port, hints);
	}
	
	@Override
	public ServerSocket newServerSocket (Protocol protocol, int port, ServerSocketHints hints) {
		return new NetJavaServerSocketImpl(protocol, port, hints);
	}

	@Override
	public Socket newClientSocket (Protocol protocol, String host, int port, SocketHints hints) {
		return new NetJavaSocketImpl(protocol, host, port, hints);
	}

	@Override
	public boolean openURI (String URI) {
		boolean result = false;
		try {
			if (!GraphicsEnvironment.isHeadless() && Desktop.isDesktopSupported()) {
				if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
					Desktop.getDesktop().browse(java.net.URI.create(URI));
					result = true;
				}
			} else {
				Box.app.error("HeadlessNet", "Opening URIs on this environment is not supported. Ignoring.");
			}
		} catch (Throwable t) {
			Box.app.error("HeadlessNet", "Failed to open URI. ", t);
		}
		return result;
	}
}
