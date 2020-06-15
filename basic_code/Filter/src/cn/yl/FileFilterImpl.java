package cn.yl;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.toString().endsWith(".txt")||pathname.isDirectory()){
            return true;
        }else {
            return false;
        }

    }
}
