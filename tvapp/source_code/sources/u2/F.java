package u2;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final String f14722a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14723b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14724c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public String f14725e;

    public F(int i7, int i8) {
        this(Integer.MIN_VALUE, i7, i8);
    }

    public final void a() {
        int i7;
        int i8 = this.d;
        if (i8 == Integer.MIN_VALUE) {
            i7 = this.f14723b;
        } else {
            i7 = i8 + this.f14724c;
        }
        this.d = i7;
        this.f14725e = this.f14722a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public F(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.f14722a = str;
        this.f14723b = i8;
        this.f14724c = i9;
        this.d = Integer.MIN_VALUE;
        this.f14725e = "";
    }
}
