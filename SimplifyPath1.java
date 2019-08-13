import java.util.Stack;

public class SimplifyPath1 {

	public static void main(String[] args) {
		String path1 = "/a//b////c/d//././/..";
		String path2 = "/a/./b/../../c/";
		String path3 = "/a/../../b/../c//.//";
		String path4 = "/.../";
		String path5 = "/home/foo/.ssh/../.ssh2/authorized_keys/";

		SimplifyPath1 sp = new SimplifyPath1();
		System.out.println(sp.simplifyPath(path1));
		System.out.println(sp.simplifyPath(path2));
		System.out.println(sp.simplifyPath(path3));
		System.out.println(sp.simplifyPath(path4));
		System.out.println(sp.simplifyPath(path5));
	}

	public String simplifyPath(String path) {

		if (path.length() == 0 || "/".equals(path))
			return "/";

		Stack<String> stack = new Stack<String>();

		String[] dirs = path.split("/");

		for (int i = 0; i < dirs.length; i++) {
			if (dirs[i].length() == 0 || ".".equals(dirs[i]))
				continue;
			else if ("..".equals(dirs[i])) {
				if (stack.size() > 0)
					stack.pop();
			} else {
				stack.add(dirs[i]);
			}
		}

		StringBuffer simpPath = new StringBuffer("");

		if (stack.isEmpty()) {
			simpPath.append("/");
			return simpPath.toString();
		}

		while (!stack.isEmpty()) {
			simpPath.insert(0, stack.pop());
			simpPath.insert(0, "/");
		}
		return simpPath.toString();
	}

}

//description in SimplifyPath2.java
