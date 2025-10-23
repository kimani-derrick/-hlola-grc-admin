package w0;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class n0 extends X {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15613a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I f15614b;

    public n0(I i7) {
        this.f15614b = i7;
    }

    @Override // w0.X
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0 && this.f15613a) {
            this.f15613a = false;
            this.f15614b.f();
        }
    }

    @Override // w0.X
    public final void b(RecyclerView recyclerView, int i7, int i8) {
        if (i7 != 0 || i8 != 0) {
            this.f15613a = true;
        }
    }
}
