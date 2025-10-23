package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
class ResizingTextView extends TextView {

    /* renamed from: q  reason: collision with root package name */
    public final int f6477q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6478r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6479s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6480t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6481u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6482v;

    /* renamed from: w  reason: collision with root package name */
    public int f6483w;

    /* renamed from: x  reason: collision with root package name */
    public float f6484x;

    /* renamed from: y  reason: collision with root package name */
    public int f6485y;

    /* renamed from: z  reason: collision with root package name */
    public int f6486z;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        this.f6482v = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10201g, 16842884, 0);
        try {
            this.f6477q = obtainStyledAttributes.getInt(1, 1);
            this.f6478r = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.f6479s = obtainStyledAttributes.getBoolean(0, false);
            this.f6480t = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f6481u = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i7, int i8) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i7, getPaddingEnd(), i8);
        } else {
            setPadding(getPaddingLeft(), i7, getPaddingRight(), i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }
}
