package devdojo.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpastas/file.bkp");
        Path path2 = Paths.get("pasta/subpastas/file.java");
        Path path3 = Paths.get("pasta/subpastas/file.txt");

        matches(path3, "glob:**.{bkp,txt,java}");

    
        
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
    
}
