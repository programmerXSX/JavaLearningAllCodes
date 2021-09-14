package 类加载器;
/*
ClassLoader中的两个方法：
	static ClassLoader getSystemClassLoader():返回用于委派的系统类加载器
	ClassLoader getParent():返回父类加载器进行委派
 */
public class ClassLoaderDemo {
	public static void main(String[] args) {
	//static ClassLoader getSystemClassLoader():返回用于委派的系统类加载器
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemClassLoader);//AppClassLoader
		
		//ClassLoader getParent():返回父类加载器进行委派
		ClassLoader systemClassLoaderParent = systemClassLoader.getParent();
		System.out.println(systemClassLoaderParent);//PlatformClassLoader
		
		//
		ClassLoader systemClassLoaderParentParent = systemClassLoaderParent.getParent();
		System.out.println(systemClassLoaderParentParent);//null
		
	}
}
