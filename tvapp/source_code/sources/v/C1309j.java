package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* renamed from: v.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309j {

    /* renamed from: m  reason: collision with root package name */
    public static final SparseIntArray f15223m;

    /* renamed from: a  reason: collision with root package name */
    public float f15224a;

    /* renamed from: b  reason: collision with root package name */
    public float f15225b;

    /* renamed from: c  reason: collision with root package name */
    public float f15226c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f15227e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f15228g;

    /* renamed from: h  reason: collision with root package name */
    public float f15229h;

    /* renamed from: i  reason: collision with root package name */
    public float f15230i;

    /* renamed from: j  reason: collision with root package name */
    public float f15231j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15232k;

    /* renamed from: l  reason: collision with root package name */
    public float f15233l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15223m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1313n.f15243h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (f15223m.get(index)) {
                case 1:
                    this.f15224a = obtainStyledAttributes.getFloat(index, this.f15224a);
                    break;
                case 2:
                    this.f15225b = obtainStyledAttributes.getFloat(index, this.f15225b);
                    break;
                case 3:
                    this.f15226c = obtainStyledAttributes.getFloat(index, this.f15226c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f15227e = obtainStyledAttributes.getFloat(index, this.f15227e);
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f15228g = obtainStyledAttributes.getDimension(index, this.f15228g);
                    break;
                case 8:
                    this.f15229h = obtainStyledAttributes.getDimension(index, this.f15229h);
                    break;
                case 9:
                    this.f15230i = obtainStyledAttributes.getDimension(index, this.f15230i);
                    break;
                case 10:
                    this.f15231j = obtainStyledAttributes.getDimension(index, this.f15231j);
                    break;
                case 11:
                    this.f15232k = true;
                    this.f15233l = obtainStyledAttributes.getDimension(index, this.f15233l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
