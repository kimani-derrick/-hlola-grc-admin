package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* renamed from: v.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308i {

    /* renamed from: a  reason: collision with root package name */
    public int f15220a;

    /* renamed from: b  reason: collision with root package name */
    public int f15221b;

    /* renamed from: c  reason: collision with root package name */
    public float f15222c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1313n.f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 1) {
                this.f15222c = obtainStyledAttributes.getFloat(index, this.f15222c);
            } else if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.f15220a);
                this.f15220a = i8;
                this.f15220a = C1310k.d[i8];
            } else if (index == 4) {
                this.f15221b = obtainStyledAttributes.getInt(index, this.f15221b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
