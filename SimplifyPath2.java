import java.util.ArrayList;
import java.util.List;

public class SimplifyPath2 {

	public static void main(String[] args) {
		String path1 = "/a//b////c/d//././/..";
		String path2 = "/a/./b/../../c/";
		String path3 = "/a/../../b/../c//.//";
		String path4 = "/.../";
		String path5 = "/home/foo/.ssh/../.ssh2/authorized_keys/";

		SimplifyPath2 sp = new SimplifyPath2();
		System.out.println(sp.simplifyPath(path1));
		System.out.println(sp.simplifyPath(path2));
		System.out.println(sp.simplifyPath(path3));
		System.out.println(sp.simplifyPath(path4));
		System.out.println(sp.simplifyPath(path5));
	}

	public String simplifyPath(String path) {

		if (path.length() == 0 || "/".equals(path))
			return path;

		String[] dirs = path.split("/");
		List<String> paths = new ArrayList<>();

		for (String dir : dirs) {
			if (dir.equals("") || dir.equals("."))
				continue;
			else if (dir.equals("..")) {
				if (paths.size() > 0)
					paths.remove(paths.size() - 1);
			} else {
				paths.add(dir);
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("/");

		if (paths.size() == 0)
			return sb.toString();

		for (int i = 0; i < paths.size(); i++) {
			sb.append(paths.get(i));
			if (i < paths.size() - 1)
				sb.append("/");
		}
		return sb.toString();
	}

}

/*Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.

In a UNIX-style file system, a period . refers to the current directory. Furthermore, a double period .. moves the directory up a level. For more information, see: Absolute path vs relative path in Linux/Unix

Note that the returned canonical path must always begin with a slash /, and there must be only a single slash / between two directory names. The last directory name (if it exists) must not end with a trailing /. Also, the canonical path must be the shortest string representing the absolute path.

 

Example 1:

Input: "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
Example 2:

Input: "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:

Input: "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
Example 4:

Input: "/a/./b/../../c/"
Output: "/c"
Example 5:

Input: "/a/../../b/../c//.//"
Output: "/c"
Example 6:

Input: "/a//b////c/d//././/.."
Output: "/a/b/c"
*/
