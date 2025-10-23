package androidx.lifecycle;
/* renamed from: androidx.lifecycle.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0347z {

    /* renamed from: q  reason: collision with root package name */
    public final Z5.n f6838q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6839r;

    /* renamed from: s  reason: collision with root package name */
    public int f6840s = -1;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ A f6841t;

    public AbstractC0347z(A a7, Z5.n nVar) {
        this.f6841t = a7;
        this.f6838q = nVar;
    }

    public final void j(boolean z7) {
        int i7;
        if (z7 == this.f6839r) {
            return;
        }
        this.f6839r = z7;
        if (z7) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        A a7 = this.f6841t;
        int i8 = a7.f6725c;
        a7.f6725c = i7 + i8;
        if (!a7.d) {
            a7.d = true;
            while (true) {
                try {
                    int i9 = a7.f6725c;
                    if (i8 == i9) {
                        break;
                    }
                    i8 = i9;
                } finally {
                    a7.d = false;
                }
            }
        }
        if (this.f6839r) {
            a7.c(this);
        }
    }

    public void k() {
    }

    public abstract boolean l();
}
