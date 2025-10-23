package k;
/* renamed from: k.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0919v0 {

    /* renamed from: a  reason: collision with root package name */
    public int f12103a;

    /* renamed from: b  reason: collision with root package name */
    public int f12104b;

    /* renamed from: c  reason: collision with root package name */
    public int f12105c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12106e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12107g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12108h;

    public final void a(int i7, int i8) {
        this.f12105c = i7;
        this.d = i8;
        this.f12108h = true;
        if (this.f12107g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f12103a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f12104b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f12103a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f12104b = i8;
        }
    }
}
