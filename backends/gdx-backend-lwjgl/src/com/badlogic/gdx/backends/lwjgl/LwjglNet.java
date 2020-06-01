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

package com.badlogic.gdx.backends.lwjgl;

import org.lwjgl.Sys;

import ru.obvilion.box.constructors.Net;
import ru.obvilion.box.net.NetJavaImpl;
import ru.obvilion.box.net.ServerSocket;
import ru.obvilion.box.net.ServerSocketHints;
import ru.obvilion.box.net.Socket;
import ru.obvilion.box.net.SocketHints;
import ru.obvilion.box.net.NetJavaSocketImpl;
import ru.obvilion.box.net.NetJavaServerSocketImpl;

/** LWJGL implementation of the {@link Net} API, it could be reused in other Desktop backends since it doesn't depend on LWJGL.
 * @author acoppes */
public class LwjglNet implements Net {

	NetJavaImpl netJavaImpl;

	public LwjglNet(LwjglApplicationConfiguration configuration) {
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
	public ServerSocket newServerSocket (Protocol protocol, String ipAddress, int port, ServerSocketHints hints) {
		return new NetJavaServerSocketImpl(protocol, ipAddress, port, hints);
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
		return Sys.openURL(URI);
	}

}
