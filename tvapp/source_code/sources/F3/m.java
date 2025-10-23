package F3;

import Z2.AbstractC0156a;
import e2.C0614k;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public int f726a;

    /* renamed from: b  reason: collision with root package name */
    public int f727b;

    /* renamed from: c  reason: collision with root package name */
    public int f728c;

    public m() {
        this.f726a = 0;
        this.f727b = 0;
        this.f728c = 0;
    }

    public C0614k a() {
        boolean z7;
        if (this.f727b <= this.f728c) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        return new C0614k(this);
    }

    public m(int i7) {
        this.f726a = i7;
    }

    public /* synthetic */ m(int i7, int i8, int i9) {
        this.f726a = i7;
        this.f727b = i8;
        this.f728c = i9;
    }
}
