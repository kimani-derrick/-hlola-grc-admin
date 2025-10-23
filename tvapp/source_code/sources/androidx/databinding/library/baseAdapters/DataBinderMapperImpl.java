package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.a;
import androidx.databinding.d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f5669a = new SparseIntArray(0);

    @Override // androidx.databinding.a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.a
    public final d b(View view, int i7) {
        if (f5669a.get(i7) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final d c(View[] viewArr, int i7) {
        if (viewArr.length == 0 || f5669a.get(i7) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.a
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) U.a.f3407a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
