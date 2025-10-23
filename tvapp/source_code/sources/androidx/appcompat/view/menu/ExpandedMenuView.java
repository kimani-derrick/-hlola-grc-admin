package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import g5.b;
import j.i;
import j.k;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f5396q = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b C3 = b.C(context, attributeSet, f5396q, 16842868, 0);
        TypedArray typedArray = (TypedArray) C3.f10842s;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(C3.z(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(C3.z(1));
        }
        C3.D();
    }

    @Override // j.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        k kVar = (k) getAdapter().getItem(i7);
        throw null;
    }
}
