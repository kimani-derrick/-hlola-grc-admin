package w0;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15473a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U f15474b;

    public /* synthetic */ S(U u7, int i7) {
        this.f15473a = i7;
        this.f15474b = u7;
    }

    public final View a(int i7) {
        switch (this.f15473a) {
            case 0:
                return this.f15474b.x(i7);
            default:
                return this.f15474b.x(i7);
        }
    }

    public final int b(View view) {
        switch (this.f15473a) {
            case 0:
                return this.f15474b.G(view) + ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).rightMargin;
            default:
                return this.f15474b.B(view) + ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f15473a) {
            case 0:
                return this.f15474b.D(view) - ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).leftMargin;
            default:
                return this.f15474b.H(view) - ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).topMargin;
        }
    }

    public final int d() {
        switch (this.f15473a) {
            case 0:
                U u7 = this.f15474b;
                return u7.n - u7.M();
            default:
                U u8 = this.f15474b;
                return u8.f15489o - u8.K();
        }
    }

    public final int e() {
        switch (this.f15473a) {
            case 0:
                return this.f15474b.L();
            default:
                return this.f15474b.N();
        }
    }
}
