package F1;

import java.io.File;
/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a  reason: collision with root package name */
    public final File f649a;

    public p(File file) {
        M5.g.f(file, "file");
        this.f649a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && M5.g.a(this.f649a, ((p) obj).f649a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f649a.hashCode();
    }

    public final String toString() {
        return "Downloaded(file=" + this.f649a + ")";
    }
}
