package e2;
/* renamed from: e2.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588E {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9486a;

    /* renamed from: b  reason: collision with root package name */
    public p0 f9487b;

    /* renamed from: c  reason: collision with root package name */
    public int f9488c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f9489e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f9490g;

    public C0588E(p0 p0Var) {
        this.f9487b = p0Var;
    }

    public final void a(int i7) {
        boolean z7;
        boolean z8 = this.f9486a;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f9486a = z8 | z7;
        this.f9488c += i7;
    }
}
