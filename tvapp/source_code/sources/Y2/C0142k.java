package Y2;

import Z2.AbstractC0156a;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.m0;
import java.net.URLDecoder;
/* renamed from: Y2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142k extends AbstractC0138g {

    /* renamed from: u  reason: collision with root package name */
    public C0148q f4402u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f4403v;

    /* renamed from: w  reason: collision with root package name */
    public int f4404w;

    /* renamed from: x  reason: collision with root package name */
    public int f4405x;

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        k();
        this.f4402u = c0148q;
        Uri normalizeScheme = c0148q.f4422a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        AbstractC0156a.e("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i7 = Z2.H.f4603a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f4403v = Base64.decode(str, 0);
                } catch (IllegalArgumentException e3) {
                    throw new m0(AbstractC0515y1.x("Error while parsing Base64 encoded string: ", str), e3, true, 0);
                }
            } else {
                this.f4403v = URLDecoder.decode(str, N3.e.f2495a.name()).getBytes(N3.e.f2497c);
            }
            byte[] bArr = this.f4403v;
            long j7 = c0148q.f;
            if (j7 <= bArr.length) {
                int i8 = (int) j7;
                this.f4404w = i8;
                int length = bArr.length - i8;
                this.f4405x = length;
                long j8 = c0148q.f4426g;
                int i9 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                if (i9 != 0) {
                    this.f4405x = (int) Math.min(length, j8);
                }
                l(c0148q);
                if (i9 == 0) {
                    return this.f4405x;
                }
                return j8;
            }
            this.f4403v = null;
            throw new C0145n(2008);
        }
        throw new m0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        if (this.f4403v != null) {
            this.f4403v = null;
            h();
        }
        this.f4402u = null;
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        C0148q c0148q = this.f4402u;
        if (c0148q != null) {
            return c0148q.f4422a;
        }
        return null;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f4405x;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f4403v;
        int i10 = Z2.H.f4603a;
        System.arraycopy(bArr2, this.f4404w, bArr, i7, min);
        this.f4404w += min;
        this.f4405x -= min;
        a(min);
        return min;
    }
}
