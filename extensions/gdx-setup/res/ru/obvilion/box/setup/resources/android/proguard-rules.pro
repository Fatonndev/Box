# To enable ProGuard in your project, edit project.properties
# to define the proguard.config property as described in that file.
#
# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in ${sdk.dir}/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the ProGuard
# include property in project.properties.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-verbose

-dontwarn android.support.**
-dontwarn AndroidFragmentApplication
-dontwarn GdxBuild
-dontwarn ru.obvilion.obvilion.gdx.physics.box2d.utils.Box2DBuild
-dontwarn ru.obvilion.obvilion.gdx.jnigen.BuildTarget*
-dontwarn ru.obvilion.obvilion.gdx.graphics.g2d.freetype.FreetypeBuild

-keep class ru.obvilion.obvilion.gdx.controllers.android.AndroidControllers

-keepclassmembers class AndroidInput* {
   <init>(Application, android.content.Context, java.lang.Object, AndroidApplicationConfiguration);
}

-keepclassmembers class World {
   boolean contactFilter(long, long);
   void    beginContact(long);
   void    endContact(long);
   void    preSolve(long, long);
   void    postSolve(long, long);
   boolean reportFixture(long);
   float   reportRayFixture(long, float, float, float, float, float);
}
