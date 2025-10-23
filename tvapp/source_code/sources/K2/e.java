package K2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class e extends J2.a {

    /* renamed from: j  reason: collision with root package name */
    public byte[] f1655j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f1656k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f1657l;

    @Override // Y2.K
    public final void a() {
        try {
            this.f1323i.c(this.f1318b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f1656k) {
                byte[] bArr = this.f1655j;
                if (bArr.length < i8 + 16384) {
                    this.f1655j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f1323i.r(this.f1655j, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f1656k) {
                this.f1657l = Arrays.copyOf(this.f1655j, i8);
            }
            p6.d.e(this.f1323i);
        } catch (Throwable th) {
            p6.d.e(this.f1323i);
            throw th;
        }
    }

    @Override // Y2.K
    public final void b() {
        this.f1656k = true;
    }
}
