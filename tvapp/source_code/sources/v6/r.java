package v6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class r extends k {
    @Override // v6.k
    public final D a(w wVar) {
        File d = wVar.d();
        Logger logger = t.f15413a;
        return new C1336a(new FileOutputStream(d, true), 1, new Object());
    }

    @Override // v6.k
    public void b(w wVar, w wVar2) {
        M5.g.f(wVar, "source");
        M5.g.f(wVar2, "target");
        if (wVar.d().renameTo(wVar2.d())) {
            return;
        }
        throw new IOException("failed to move " + wVar + " to " + wVar2);
    }

    @Override // v6.k
    public final void c(w wVar) {
        if (!wVar.d().mkdir()) {
            u.e i7 = i(wVar);
            if (i7 != null && i7.f14614c) {
                return;
            }
            throw new IOException("failed to create directory: " + wVar);
        }
    }

    @Override // v6.k
    public final void d(w wVar) {
        M5.g.f(wVar, "path");
        if (!Thread.interrupted()) {
            File d = wVar.d();
            if (!d.delete() && d.exists()) {
                throw new IOException("failed to delete " + wVar);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // v6.k
    public final List g(w wVar) {
        M5.g.f(wVar, "dir");
        File d = wVar.d();
        String[] list = d.list();
        if (list == null) {
            if (!d.exists()) {
                throw new FileNotFoundException("no such file: " + wVar);
            }
            throw new IOException("failed to list " + wVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            M5.g.e(str, "it");
            arrayList.add(wVar.c(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // v6.k
    public u.e i(w wVar) {
        M5.g.f(wVar, "path");
        File d = wVar.d();
        boolean isFile = d.isFile();
        boolean isDirectory = d.isDirectory();
        long lastModified = d.lastModified();
        long length = d.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !d.exists()) {
            return null;
        }
        return new u.e(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // v6.k
    public final q j(w wVar) {
        M5.g.f(wVar, "file");
        return new q(new RandomAccessFile(wVar.d(), "r"));
    }

    @Override // v6.k
    public final D k(w wVar) {
        M5.g.f(wVar, "file");
        File d = wVar.d();
        Logger logger = t.f15413a;
        return new C1336a(new FileOutputStream(d, false), 1, new Object());
    }

    @Override // v6.k
    public final F l(w wVar) {
        M5.g.f(wVar, "file");
        File d = wVar.d();
        Logger logger = t.f15413a;
        return new C1337b(new FileInputStream(d), H.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
