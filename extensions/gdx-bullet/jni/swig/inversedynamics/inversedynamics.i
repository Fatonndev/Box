%module(directors="1") InverseDynamics

%include "arrays_java.i"

%import "../softbody/softbody.i"

%include "../common/gdxCommon.i"

%include "../../swig-src/linearmath/classes.i"
%include "../../swig-src/collision/classes.i"
%include "../../swig-src/dynamics/classes.i"
%include "../../swig-src/softbody/classes.i"

%typemap(javaimports) SWIGTYPE	%{
import ru.obvilion.box.physics.bullet.BulletBase;
import ru.obvilion.box.physics.bullet.linearmath.*;
import ru.obvilion.box.physics.bullet.collision.*;
import ru.obvilion.box.physics.bullet.dynamics.*;
import Vector3;
import Quaternion;
import Matrix3;
import Matrix4;
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
%}

%{
#include <BulletInverseDynamics/IDConfig.hpp>
%}
%include "BulletInverseDynamics/IDConfig.hpp"

%{
#include <BulletInverseDynamics/IDErrorMessages.hpp>
%}
%include "BulletInverseDynamics/IDErrorMessages.hpp"

%{
#include <BulletInverseDynamics/IDMath.hpp>
%}
%include "BulletInverseDynamics/IDMath.hpp"

%rename(finalizeInternal) btInverseDynamicsBullet3::MultiBodyTree::finalize();
%{
#include <BulletInverseDynamics/MultiBodyTree.hpp>
%}
%include "BulletInverseDynamics/MultiBodyTree.hpp"

/*
%rename(operatorSubscriptConst) btVectorX< idScalar >::operator [](int) const;
%template(btVectorXIdScalar) btVectorX< idScalar >;
%template(btMatrixXIdScalar) btMatrixX< idScalar >;
%rename(operatorFunctionCallConst) btInverseDynamicsBullet3::vec3::operator ()(int) const;
%rename(operatorFunctionCallConst) btInverseDynamicsBullet3::mat33::operator ()(int,int) const;
%rename(operatorFunctionCallConst) btInverseDynamicsBullet3::vecx::operator ()(int) const;
%{
#include <BulletInverseDynamics/details/IDLinearMathInterface.hpp>
%}
%include "BulletInverseDynamics/details/IDLinearMathInterface.hpp"

%{
#include <BulletInverseDynamics/details/MultiBodyTreeImpl.hpp>
%}
%include "BulletInverseDynamics/details/MultiBodyTreeImpl.hpp"

%{
#include <BulletInverseDynamics/details/MultiBodyTreeInitCache.hpp>
%}
%include "BulletInverseDynamics/details/MultiBodyTreeInitCache.hpp"
*/
%{
using namespace btInverseDynamicsBullet3;
%}
