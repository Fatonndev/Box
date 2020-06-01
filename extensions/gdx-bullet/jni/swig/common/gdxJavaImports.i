/* 
 * Defines all the imports for all Java proxies, the JNI class, and the 
 * module class.
 */ 
 
%typemap(javaimports) SWIGTYPE	%{
import ru.obvilion.box.physics.bullet.BulletBase;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
%}
%pragma(java) jniclassimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
import Pool;
%}
%pragma(java) moduleimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
%}
