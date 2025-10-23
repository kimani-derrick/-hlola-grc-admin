package e2;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
/* loaded from: classes.dex */
public class m0 extends IOException {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f10017q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10018r;

    public m0(String str, Exception exc, boolean z7, int i7) {
        super(str, exc);
        this.f10017q = z7;
        this.f10018r = i7;
    }

    public static m0 a(String str, Exception exc) {
        return new m0(str, exc, true, 1);
    }

    public static m0 b(String str) {
        return new m0(str, null, true, 4);
    }

    public static m0 c(String str) {
        return new m0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.f10017q);
        sb.append(", dataType=");
        return AbstractC0515y1.n(sb, this.f10018r, "}");
    }
}
