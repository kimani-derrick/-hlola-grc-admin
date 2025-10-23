package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: v.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304e {

    /* renamed from: a  reason: collision with root package name */
    public final float f15151a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15152b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15153c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15154e;

    public C1304e(Context context, XmlResourceParser xmlResourceParser) {
        this.f15151a = Float.NaN;
        this.f15152b = Float.NaN;
        this.f15153c = Float.NaN;
        this.d = Float.NaN;
        this.f15154e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1313n.f15244i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f15154e);
                this.f15154e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1310k().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f15152b = obtainStyledAttributes.getDimension(index, this.f15152b);
            } else if (index == 3) {
                this.f15153c = obtainStyledAttributes.getDimension(index, this.f15153c);
            } else if (index == 4) {
                this.f15151a = obtainStyledAttributes.getDimension(index, this.f15151a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
