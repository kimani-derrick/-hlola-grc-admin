package v6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
/* loaded from: classes.dex */
public final class s extends r {
    public static Long m(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // v6.r, v6.k
    public final void b(w wVar, w wVar2) {
        M5.g.f(wVar, "source");
        M5.g.f(wVar2, "target");
        try {
            Files.move(wVar.e(), wVar2.e(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e3) {
            throw new FileNotFoundException(e3.getMessage());
        }
    }

    @Override // v6.r, v6.k
    public final u.e i(w wVar) {
        Path path;
        w wVar2;
        Long l7;
        Long l8;
        M5.g.f(wVar, "path");
        Path e3 = wVar.e();
        Long l9 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(e3, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path = Files.readSymbolicLink(e3);
            } else {
                path = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path != null) {
                String str = w.f15416r;
                wVar2 = u0.j.j(path.toString(), false);
            } else {
                wVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l7 = m(creationTime);
            } else {
                l7 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l8 = m(lastModifiedTime);
            } else {
                l8 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l9 = m(lastAccessTime);
            }
            return new u.e(isRegularFile, isDirectory, wVar2, valueOf, l7, l8, l9);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // v6.r
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
