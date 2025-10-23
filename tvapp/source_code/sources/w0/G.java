package w0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class G extends androidx.emoji2.text.f {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(U u7, int i7) {
        super(u7);
        this.d = i7;
    }

    @Override // androidx.emoji2.text.f
    public final int b(View view) {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).G(view) + ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).rightMargin;
            default:
                return ((U) this.f5838b).B(view) + ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int c(View view) {
        switch (this.d) {
            case 0:
                V v5 = (V) view.getLayoutParams();
                ((U) this.f5838b).getClass();
                return U.F(view) + ((ViewGroup.MarginLayoutParams) v5).leftMargin + ((ViewGroup.MarginLayoutParams) v5).rightMargin;
            default:
                V v7 = (V) view.getLayoutParams();
                ((U) this.f5838b).getClass();
                return U.E(view) + ((ViewGroup.MarginLayoutParams) v7).topMargin + ((ViewGroup.MarginLayoutParams) v7).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int d(View view) {
        switch (this.d) {
            case 0:
                V v5 = (V) view.getLayoutParams();
                ((U) this.f5838b).getClass();
                return U.E(view) + ((ViewGroup.MarginLayoutParams) v5).topMargin + ((ViewGroup.MarginLayoutParams) v5).bottomMargin;
            default:
                V v7 = (V) view.getLayoutParams();
                ((U) this.f5838b).getClass();
                return U.F(view) + ((ViewGroup.MarginLayoutParams) v7).leftMargin + ((ViewGroup.MarginLayoutParams) v7).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int e(View view) {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).D(view) - ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).leftMargin;
            default:
                return ((U) this.f5838b).H(view) - ((ViewGroup.MarginLayoutParams) ((V) view.getLayoutParams())).topMargin;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int f() {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).n;
            default:
                return ((U) this.f5838b).f15489o;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int g() {
        switch (this.d) {
            case 0:
                U u7 = (U) this.f5838b;
                return u7.n - u7.M();
            default:
                U u8 = (U) this.f5838b;
                return u8.f15489o - u8.K();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int h() {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).M();
            default:
                return ((U) this.f5838b).K();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int i() {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).f15487l;
            default:
                return ((U) this.f5838b).f15488m;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int j() {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).f15488m;
            default:
                return ((U) this.f5838b).f15487l;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int k() {
        switch (this.d) {
            case 0:
                return ((U) this.f5838b).L();
            default:
                return ((U) this.f5838b).N();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int l() {
        switch (this.d) {
            case 0:
                U u7 = (U) this.f5838b;
                return (u7.n - u7.L()) - u7.M();
            default:
                U u8 = (U) this.f5838b;
                return (u8.f15489o - u8.N()) - u8.K();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int n(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f5839c;
                ((U) this.f5838b).R(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f5839c;
                ((U) this.f5838b).R(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int o(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f5839c;
                ((U) this.f5838b).R(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f5839c;
                ((U) this.f5838b).R(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.f
    public final void p(int i7) {
        switch (this.d) {
            case 0:
                ((U) this.f5838b).Z(i7);
                return;
            default:
                ((U) this.f5838b).a0(i7);
                return;
        }
    }
}
