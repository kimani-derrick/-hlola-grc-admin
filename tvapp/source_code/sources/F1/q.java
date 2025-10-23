package F1;

import android.net.Uri;
/* loaded from: classes.dex */
public final class q implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f650a;

    public q(Uri uri) {
        M5.g.f(uri, "uri");
        this.f650a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && M5.g.a(this.f650a, ((q) obj).f650a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f650a.hashCode();
    }

    public final String toString() {
        return "DownloadedR(uri=" + this.f650a + ")";
    }
}
