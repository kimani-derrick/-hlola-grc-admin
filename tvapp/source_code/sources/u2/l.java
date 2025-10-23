package u2;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final k2.w f14808a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14809b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14810c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f14811e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f14812g;

    /* renamed from: h  reason: collision with root package name */
    public long f14813h;

    public l(k2.w wVar) {
        this.f14808a = wVar;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        boolean z7;
        if (this.f14810c) {
            int i9 = this.f;
            int i10 = (i7 + 1) - i9;
            if (i10 < i8) {
                if (((bArr[i10] & 192) >> 6) == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.d = z7;
                this.f14810c = false;
                return;
            }
            this.f = (i8 - i7) + i9;
        }
    }
}
