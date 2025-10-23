package v6;

import java.io.FileNotFoundException;
import java.util.List;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final r f15396a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [v6.r] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f15396a = r02;
        String str = w.f15416r;
        String property = System.getProperty("java.io.tmpdir");
        M5.g.e(property, "getProperty(\"java.io.tmpdir\")");
        u0.j.j(property, false);
        ClassLoader classLoader = w6.c.class.getClassLoader();
        M5.g.e(classLoader, "ResourceFileSystem::class.java.classLoader");
        new w6.c(classLoader);
    }

    public abstract D a(w wVar);

    public abstract void b(w wVar, w wVar2);

    public abstract void c(w wVar);

    public abstract void d(w wVar);

    public final void e(w wVar) {
        M5.g.f(wVar, "path");
        d(wVar);
    }

    public final boolean f(w wVar) {
        M5.g.f(wVar, "path");
        if (i(wVar) != null) {
            return true;
        }
        return false;
    }

    public abstract List g(w wVar);

    public final u.e h(w wVar) {
        M5.g.f(wVar, "path");
        u.e i7 = i(wVar);
        if (i7 != null) {
            return i7;
        }
        throw new FileNotFoundException("no such file: " + wVar);
    }

    public abstract u.e i(w wVar);

    public abstract q j(w wVar);

    public abstract D k(w wVar);

    public abstract F l(w wVar);
}
