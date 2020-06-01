%module(directors="1") Extras

%include "arrays_java.i"

%import "../inversedynamics/inversedynamics.i"

%include "../common/gdxCommon.i"

%include "../../swig-src/linearmath/classes.i"
%include "../../swig-src/collision/classes.i"
%include "../../swig-src/dynamics/classes.i"
%include "../../swig-src/softbody/classes.i"
%include "../../swig-src/inversedynamics/classes.i"

%typemap(javaimports) SWIGTYPE	%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
import ru.obvilion.box.physics.bullet.inversedynamics.MultiBodyTree;
import ru.obvilion.box.physics.bullet.dynamics.btDynamicsWorld;
import ru.obvilion.box.physics.bullet.dynamics.btContactSolverInfo;
import ru.obvilion.box.physics.bullet.collision.btCollisionShape;
%}
%pragma(java) jniclassimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
import Pool;
import ru.obvilion.box.physics.bullet.inversedynamics.MultiBodyTree;
import ru.obvilion.box.physics.bullet.dynamics.btDynamicsWorld;
import ru.obvilion.box.physics.bullet.dynamics.btContactSolverInfo;
import ru.obvilion.box.physics.bullet.collision.btCollisionShape;
%}
%pragma(java) moduleimports=%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
import ru.obvilion.box.physics.bullet.inversedynamics.MultiBodyTree;
import ru.obvilion.box.physics.bullet.dynamics.btDynamicsWorld;
import ru.obvilion.box.physics.bullet.dynamics.btContactSolverInfo;
import ru.obvilion.box.physics.bullet.collision.btCollisionShape;
%}

%include "./serialize/gdxBulletSerialize.i"
%include "./inversedynamics/gdxBulletInversedynamics.i"
