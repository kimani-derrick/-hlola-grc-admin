package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final DataBinderMapperImpl f5656a = new DataBinderMapperImpl();

    public static d a(ViewGroup viewGroup, int i7, int i8) {
        int childCount = viewGroup.getChildCount();
        int i9 = childCount - i7;
        DataBinderMapperImpl dataBinderMapperImpl = f5656a;
        if (i9 == 1) {
            return dataBinderMapperImpl.b(viewGroup.getChildAt(childCount - 1), i8);
        }
        View[] viewArr = new View[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            viewArr[i10] = viewGroup.getChildAt(i10 + i7);
        }
        return dataBinderMapperImpl.c(viewArr, i8);
    }

    public static d b(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, boolean z7) {
        boolean z8;
        int i8 = 0;
        if (viewGroup != null && z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i7, viewGroup, z7);
        if (z8) {
            return a(viewGroup, i8, i7);
        }
        return f5656a.b(inflate, i7);
    }
}
