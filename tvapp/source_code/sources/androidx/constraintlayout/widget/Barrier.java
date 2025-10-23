package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import t.C1215a;
import t.C1218d;
import v.AbstractC1301b;
import v.AbstractC1313n;
/* loaded from: classes.dex */
public class Barrier extends AbstractC1301b {

    /* renamed from: w  reason: collision with root package name */
    public int f5569w;

    /* renamed from: x  reason: collision with root package name */
    public int f5570x;

    /* renamed from: y  reason: collision with root package name */
    public C1215a f5571y;

    public Barrier(Context context) {
        super(context);
        this.f15086q = new int[32];
        this.f15091v = new HashMap();
        this.f15088s = context;
        e(null);
        super.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [t.a, t.d] */
    public final void e(AttributeSet attributeSet) {
        int[] iArr = AbstractC1313n.f15239b;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f15090u = string;
                    setIds(string);
                }
            }
        }
        ?? c1218d = new C1218d();
        c1218d.f14422d0 = new C1218d[4];
        c1218d.f14423e0 = 0;
        c1218d.f14424f0 = 0;
        c1218d.f14425g0 = true;
        c1218d.f14426h0 = 0;
        this.f5571y = c1218d;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i8 = 0; i8 < indexCount2; i8++) {
                int index2 = obtainStyledAttributes2.getIndex(i8);
                if (index2 == 15) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 14) {
                    this.f5571y.f14425g0 = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 16) {
                    this.f5571y.f14426h0 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
        }
        this.f15089t = this.f5571y;
        d();
    }

    public int getMargin() {
        return this.f5571y.f14426h0;
    }

    public int getType() {
        return this.f5569w;
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f5571y.f14425g0 = z7;
    }

    public void setDpMargin(int i7) {
        this.f5571y.f14426h0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.f5571y.f14426h0 = i7;
    }

    public void setType(int i7) {
        this.f5569w = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15086q = new int[32];
        this.f15091v = new HashMap();
        this.f15088s = context;
        e(attributeSet);
        super.setVisibility(8);
    }
}
