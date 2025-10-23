package u4;

import java.io.File;
import w4.F0;
/* renamed from: u4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278b {

    /* renamed from: a  reason: collision with root package name */
    public final F0 f14985a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14986b;

    /* renamed from: c  reason: collision with root package name */
    public final File f14987c;

    public C1278b(w4.B b7, String str, File file) {
        this.f14985a = b7;
        if (str != null) {
            this.f14986b = str;
            if (file != null) {
                this.f14987c = file;
                return;
            }
            throw new NullPointerException("Null reportFile");
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1278b)) {
            return false;
        }
        C1278b c1278b = (C1278b) obj;
        if (this.f14985a.equals(c1278b.f14985a) && this.f14986b.equals(c1278b.f14986b) && this.f14987c.equals(c1278b.f14987c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14985a.hashCode() ^ 1000003) * 1000003) ^ this.f14986b.hashCode()) * 1000003) ^ this.f14987c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f14985a + ", sessionId=" + this.f14986b + ", reportFile=" + this.f14987c + "}";
    }
}
