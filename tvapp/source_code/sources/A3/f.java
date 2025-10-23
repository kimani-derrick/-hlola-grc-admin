package A3;

import K.C0026b;
import L.i;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.boxhdo.android.tv.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
/* loaded from: classes.dex */
public final class f extends C0026b {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f86e;

    public /* synthetic */ f(int i7, Object obj) {
        this.d = i7;
        this.f86e = obj;
    }

    @Override // K.C0026b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        int i7 = this.d;
        super.c(view, accessibilityEvent);
        switch (i7) {
            case 1:
                accessibilityEvent.setChecked(((CheckableImageButton) this.f86e).f8912t);
                return;
            default:
                return;
        }
    }

    @Override // K.C0026b
    public final void d(View view, i iVar) {
        int i7;
        Object obj = this.f86e;
        View.AccessibilityDelegate accessibilityDelegate = this.f1466a;
        switch (this.d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, iVar.f1854a);
                int i8 = MaterialButtonToggleGroup.f8804A;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i9 = -1;
                if (view instanceof MaterialButton) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i10 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i10) == view) {
                                i9 = i11;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.c(i10)) {
                                    i11++;
                                }
                                i10++;
                            }
                        }
                    }
                }
                iVar.k(L.h.a(((MaterialButton) view).f8795D, 0, 1, i9, 1));
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1854a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f8913u);
                accessibilityNodeInfo.setChecked(checkableImageButton.f8912t);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f1854a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f8918N);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, iVar.f1854a);
                j jVar = (j) obj;
                if (jVar.f8875w0.getVisibility() == 0) {
                    i7 = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    i7 = R.string.mtrl_picker_toggle_to_day_selection;
                }
                iVar.l(jVar.v(i7));
                return;
        }
    }
}
