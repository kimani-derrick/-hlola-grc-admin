package k;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.boxhdo.android.tv.R;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
/* renamed from: k.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnLayoutChangeListenerC0925y0 implements View.OnLayoutChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12114q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f12115r;

    public /* synthetic */ View$OnLayoutChangeListenerC0925y0(int i7, Object obj) {
        this.f12114q = i7;
        this.f12115r = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        switch (this.f12114q) {
            case 0:
                SearchView searchView = (SearchView) this.f12115r;
                View view2 = searchView.f5487N;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f5481H.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a7 = Y0.a(searchView);
                    if (searchView.f5501f0) {
                        i15 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    } else {
                        i15 = 0;
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a7) {
                        i16 = -rect.left;
                    } else {
                        i16 = paddingLeft - (rect.left + i15);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i16);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i15) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) this.f12115r).getClass();
                throw null;
        }
    }
}
