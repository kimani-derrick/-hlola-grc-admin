package a0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p6.l;
/* renamed from: a0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195f extends l {

    /* renamed from: r  reason: collision with root package name */
    public final TextView f4970r;

    /* renamed from: s  reason: collision with root package name */
    public final C0193d f4971s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4972t = true;

    public C0195f(TextView textView) {
        this.f4970r = textView;
        this.f4971s = new C0193d(textView);
    }

    @Override // p6.l
    public final void G(boolean z7) {
        if (z7) {
            V();
        }
    }

    @Override // p6.l
    public final void H(boolean z7) {
        this.f4972t = z7;
        V();
        TextView textView = this.f4970r;
        textView.setFilters(v(textView.getFilters()));
    }

    public final void V() {
        TextView textView = this.f4970r;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f4972t) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f4979a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p6.l
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f4972t) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof C0193d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i8 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    if (sparseArray.indexOfKey(i9) < 0) {
                        inputFilterArr2[i8] = inputFilterArr[i9];
                        i8++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            C0193d c0193d = this.f4971s;
            if (i10 < length2) {
                if (inputFilterArr[i10] != c0193d) {
                    i10++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0193d;
                return inputFilterArr3;
            }
        }
    }
}
