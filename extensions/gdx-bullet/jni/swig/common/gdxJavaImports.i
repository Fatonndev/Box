/* 
 * Defines all the imports for all Java proxies, the JNI class, and the 
 * module class.
 */ 
 
%typemap(javaimports) SWIGTYPE	%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;
%}
%pragma(java) jniclassimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;
import ru.obvilion.box.utils.Pool;
%}
%pragma(java) moduleimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.math.Vector3;
import ru.obvilion.box.math.Quaternion;
import ru.obvilion.box.math.Matrix3;
import ru.obvilion.box.math.Matrix4;
%}
