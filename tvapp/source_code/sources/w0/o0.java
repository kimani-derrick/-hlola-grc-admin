package w0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public int f15620a;

    /* renamed from: b  reason: collision with root package name */
    public int f15621b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15622c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15623e;
    public int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f15624g;

    public o0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f15624g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f15620a = -1;
        this.f15621b = Integer.MIN_VALUE;
        this.f15622c = false;
        this.d = false;
        this.f15623e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
