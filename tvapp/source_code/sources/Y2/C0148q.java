package Y2;

import Z2.AbstractC0156a;
import android.net.Uri;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.AbstractC0592I;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Y2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148q {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f4421k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4422a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4423b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4424c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f4425e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4426g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4427h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4428i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f4429j;

    static {
        AbstractC0592I.a("goog.exo.datasource");
    }

    public C0148q(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj) {
        boolean z7;
        boolean z8;
        byte[] bArr2 = bArr;
        boolean z9 = false;
        if (j7 + j8 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        AbstractC0156a.f((j9 > 0 || j9 == -1) ? true : z9);
        this.f4422a = uri;
        this.f4423b = j7;
        this.f4424c = i7;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f4425e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j8;
        this.f4426g = j9;
        this.f4427h = str;
        this.f4428i = i8;
        this.f4429j = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y2.p, java.lang.Object] */
    public final C0147p a() {
        ?? obj = new Object();
        obj.f4413a = this.f4422a;
        obj.f4414b = this.f4423b;
        obj.f4415c = this.f4424c;
        obj.d = this.d;
        obj.f4416e = this.f4425e;
        obj.f = this.f;
        obj.f4417g = this.f4426g;
        obj.f4418h = this.f4427h;
        obj.f4419i = this.f4428i;
        obj.f4420j = this.f4429j;
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f4424c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f4422a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.f4426g);
        sb.append(", ");
        sb.append(this.f4427h);
        sb.append(", ");
        return AbstractC0515y1.n(sb, this.f4428i, "]");
    }
}
