package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: q  reason: collision with root package name */
    public boolean f6433q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6434r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f6435s;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6433q = false;
        this.f6435s = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int i7;
        if (!this.f6434r) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                i7 = indexOfChild(view2);
                break;
            }
        }
        i7 = -1;
        if (i7 != -1) {
            ((ArrayList) this.f6435s.get(i7)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        ArrayList arrayList = this.f6435s;
        int i11 = 0;
        try {
            boolean z8 = this.f6433q && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f6434r = z8;
            if (z8) {
                while (arrayList.size() > getChildCount()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                while (arrayList.size() < getChildCount()) {
                    arrayList.add(new ArrayList());
                }
            }
            super.onLayout(z7, i7, i8, i9, i10);
            if (this.f6434r) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    for (int i13 = 0; i13 < ((ArrayList) arrayList.get(i12)).size(); i13++) {
                        super.focusableViewAvailable((View) ((ArrayList) arrayList.get(i12)).get(i13));
                    }
                }
            }
            if (this.f6434r) {
                this.f6434r = false;
                while (i11 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i11)).clear();
                    i11++;
                }
            }
        } catch (Throwable th) {
            if (this.f6434r) {
                this.f6434r = false;
                while (i11 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i11)).clear();
                    i11++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z7) {
        this.f6433q = z7;
    }
}
