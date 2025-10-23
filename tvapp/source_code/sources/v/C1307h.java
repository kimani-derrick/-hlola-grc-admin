package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import r.AbstractC1110a;
/* renamed from: v.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307h {

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f15216e;

    /* renamed from: a  reason: collision with root package name */
    public int f15217a;

    /* renamed from: b  reason: collision with root package name */
    public int f15218b;

    /* renamed from: c  reason: collision with root package name */
    public float f15219c;
    public float d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15216e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1313n.f15241e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (f15216e.get(index)) {
                case 1:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 2:
                    this.f15218b = obtainStyledAttributes.getInt(index, this.f15218b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1110a.f13409a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f15217a = C1310k.f(obtainStyledAttributes, index, this.f15217a);
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f15219c = obtainStyledAttributes.getFloat(index, this.f15219c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
