package k2;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12202a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f12203b;

    /* renamed from: c  reason: collision with root package name */
    public int f12204c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public int f12205e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f12206g;

    public final void a(w wVar, C0957v c0957v) {
        if (this.f12204c > 0) {
            wVar.c(this.d, this.f12205e, this.f, this.f12206g, c0957v);
            this.f12204c = 0;
        }
    }

    public final void b(w wVar, long j7, int i7, int i8, int i9, C0957v c0957v) {
        boolean z7;
        if (this.f12206g <= i8 + i9) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            if (!this.f12203b) {
                return;
            }
            int i10 = this.f12204c;
            int i11 = i10 + 1;
            this.f12204c = i11;
            if (i10 == 0) {
                this.d = j7;
                this.f12205e = i7;
                this.f = 0;
            }
            this.f += i8;
            this.f12206g = i9;
            if (i11 >= 16) {
                a(wVar, c0957v);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(InterfaceC0947l interfaceC0947l) {
        char c5;
        if (this.f12203b) {
            return;
        }
        byte[] bArr = this.f12202a;
        interfaceC0947l.o(bArr, 0, 10);
        interfaceC0947l.b();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                if ((b7 & 255) == 187) {
                    c5 = '\t';
                } else {
                    c5 = '\b';
                }
                if ((40 << ((bArr[c5] >> 4) & 7)) != 0) {
                    this.f12203b = true;
                }
            }
        }
    }
}
