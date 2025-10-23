package X2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
/* renamed from: X2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnLayoutChangeListenerC0128j implements View.OnLayoutChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4182q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f4183r;

    public /* synthetic */ View$OnLayoutChangeListenerC0128j(int i7, Object obj) {
        this.f4182q = i7;
        this.f4183r = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int height;
        int i16;
        int height2;
        boolean z7;
        switch (this.f4182q) {
            case 0:
                w wVar = (w) this.f4183r;
                wVar.getClass();
                int i17 = i10 - i8;
                int i18 = i14 - i12;
                if (i9 - i7 != i13 - i11 || i17 != i18) {
                    PopupWindow popupWindow = wVar.f4207A;
                    if (popupWindow.isShowing()) {
                        wVar.q();
                        int i19 = wVar.f4209B;
                        popupWindow.update(view, (wVar.getWidth() - popupWindow.getWidth()) - i19, (-popupWindow.getHeight()) - i19, -1, -1);
                        return;
                    }
                    return;
                }
                return;
            default:
                B b7 = (B) this.f4183r;
                w wVar2 = b7.f4088a;
                int width = (wVar2.getWidth() - wVar2.getPaddingLeft()) - wVar2.getPaddingRight();
                int height3 = (wVar2.getHeight() - wVar2.getPaddingBottom()) - wVar2.getPaddingTop();
                ViewGroup viewGroup = b7.f4090c;
                int d = B.d(viewGroup);
                boolean z8 = false;
                if (viewGroup != null) {
                    i15 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i15 = 0;
                }
                int i20 = d - i15;
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i16 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i16 = 0;
                }
                int i21 = height - i16;
                int max = Math.max(i20, B.d(b7.f4096k) + B.d(b7.f4094i));
                ViewGroup viewGroup2 = b7.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i22 = (height2 * 2) + i21;
                if (width > max && height3 > i22) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (b7.f4085A != z7) {
                    b7.f4085A = z7;
                    view.post(new x(b7, 1));
                }
                if (i9 - i7 != i13 - i11) {
                    z8 = true;
                }
                if (!b7.f4085A && z8) {
                    view.post(new x(b7, 2));
                    return;
                }
                return;
        }
    }
}
