package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import g2.O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.e;
import t.C1218d;
import t.C1219e;
import t.f;
import t2.i;
import v.AbstractC1301b;
import v.AbstractC1302c;
import v.AbstractC1311l;
import v.AbstractC1313n;
import v.C1303d;
import v.C1304e;
import v.C1310k;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public i f5572A;

    /* renamed from: B  reason: collision with root package name */
    public int f5573B;

    /* renamed from: C  reason: collision with root package name */
    public HashMap f5574C;

    /* renamed from: D  reason: collision with root package name */
    public final SparseArray f5575D;

    /* renamed from: E  reason: collision with root package name */
    public final O f5576E;

    /* renamed from: q  reason: collision with root package name */
    public final SparseArray f5577q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5578r;

    /* renamed from: s  reason: collision with root package name */
    public final C1219e f5579s;

    /* renamed from: t  reason: collision with root package name */
    public int f5580t;

    /* renamed from: u  reason: collision with root package name */
    public int f5581u;

    /* renamed from: v  reason: collision with root package name */
    public int f5582v;

    /* renamed from: w  reason: collision with root package name */
    public int f5583w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5584x;

    /* renamed from: y  reason: collision with root package name */
    public int f5585y;

    /* renamed from: z  reason: collision with root package name */
    public C1310k f5586z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5577q = new SparseArray();
        this.f5578r = new ArrayList(4);
        this.f5579s = new C1219e();
        this.f5580t = 0;
        this.f5581u = 0;
        this.f5582v = Integer.MAX_VALUE;
        this.f5583w = Integer.MAX_VALUE;
        this.f5584x = true;
        this.f5585y = 263;
        this.f5586z = null;
        this.f5572A = null;
        this.f5573B = -1;
        this.f5574C = new HashMap();
        this.f5575D = new SparseArray();
        this.f5576E = new O(this);
        c(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, v.d] */
    public static C1303d a() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f15117a = -1;
        marginLayoutParams.f15119b = -1;
        marginLayoutParams.f15121c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.f15124e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f15127g = -1;
        marginLayoutParams.f15129h = -1;
        marginLayoutParams.f15131i = -1;
        marginLayoutParams.f15133j = -1;
        marginLayoutParams.f15135k = -1;
        marginLayoutParams.f15137l = -1;
        marginLayoutParams.f15138m = -1;
        marginLayoutParams.n = 0;
        marginLayoutParams.f15139o = 0.0f;
        marginLayoutParams.f15140p = -1;
        marginLayoutParams.f15141q = -1;
        marginLayoutParams.f15142r = -1;
        marginLayoutParams.f15143s = -1;
        marginLayoutParams.f15144t = -1;
        marginLayoutParams.f15145u = -1;
        marginLayoutParams.f15146v = -1;
        marginLayoutParams.f15147w = -1;
        marginLayoutParams.f15148x = -1;
        marginLayoutParams.f15149y = -1;
        marginLayoutParams.f15150z = 0.5f;
        marginLayoutParams.f15093A = 0.5f;
        marginLayoutParams.f15094B = null;
        marginLayoutParams.f15095C = 1;
        marginLayoutParams.f15096D = -1.0f;
        marginLayoutParams.f15097E = -1.0f;
        marginLayoutParams.F = 0;
        marginLayoutParams.f15098G = 0;
        marginLayoutParams.f15099H = 0;
        marginLayoutParams.f15100I = 0;
        marginLayoutParams.f15101J = 0;
        marginLayoutParams.f15102K = 0;
        marginLayoutParams.f15103L = 0;
        marginLayoutParams.f15104M = 0;
        marginLayoutParams.f15105N = 1.0f;
        marginLayoutParams.f15106O = 1.0f;
        marginLayoutParams.f15107P = -1;
        marginLayoutParams.f15108Q = -1;
        marginLayoutParams.f15109R = -1;
        marginLayoutParams.f15110S = false;
        marginLayoutParams.f15111T = false;
        marginLayoutParams.f15112U = null;
        marginLayoutParams.f15113V = true;
        marginLayoutParams.W = true;
        marginLayoutParams.f15114X = false;
        marginLayoutParams.f15115Y = false;
        marginLayoutParams.f15116Z = false;
        marginLayoutParams.f15118a0 = -1;
        marginLayoutParams.f15120b0 = -1;
        marginLayoutParams.f15122c0 = -1;
        marginLayoutParams.f15123d0 = -1;
        marginLayoutParams.f15125e0 = -1;
        marginLayoutParams.f15126f0 = -1;
        marginLayoutParams.f15128g0 = 0.5f;
        marginLayoutParams.f15136k0 = new C1218d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    public final C1218d b(View view) {
        if (view == this) {
            return this.f5579s;
        }
        if (view == null) {
            return null;
        }
        return ((C1303d) view.getLayoutParams()).f15136k0;
    }

    public final void c(AttributeSet attributeSet, int i7) {
        C1219e c1219e = this.f5579s;
        c1219e.f14465U = this;
        O o7 = this.f5576E;
        c1219e.f14499g0 = o7;
        c1219e.f14498f0.f14617h = o7;
        this.f5577q.put(getId(), this);
        this.f5586z = null;
        boolean z7 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1313n.f15239b, i7, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 9) {
                    this.f5580t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5580t);
                } else if (index == 10) {
                    this.f5581u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5581u);
                } else if (index == 7) {
                    this.f5582v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5582v);
                } else if (index == 8) {
                    this.f5583w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5583w);
                } else if (index == 89) {
                    this.f5585y = obtainStyledAttributes.getInt(index, this.f5585y);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5572A = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1310k c1310k = new C1310k();
                        this.f5586z = c1310k;
                        c1310k.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5586z = null;
                    }
                    this.f5573B = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i9 = this.f5585y;
        c1219e.f14508p0 = i9;
        if ((i9 & 256) == 256) {
            z7 = true;
        }
        e.f13495p = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1303d;
    }

    public final void d(int i7) {
        char c5;
        Context context = getContext();
        i iVar = new i((char) 0, 8);
        iVar.f14556r = new SparseArray();
        iVar.f14557s = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            O2.e eVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c5 = 4;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        if (c5 != 0 && c5 != 1) {
                            if (c5 != 2) {
                                if (c5 != 3) {
                                    if (c5 != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                        continue;
                                    } else {
                                        iVar.x(context, xml);
                                        continue;
                                    }
                                } else {
                                    C1304e c1304e = new C1304e(context, xml);
                                    if (eVar != null) {
                                        ((ArrayList) eVar.f2561c).add(c1304e);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                eVar = new O2.e(context, xml);
                                ((SparseArray) iVar.f14556r).put(eVar.f2559a, eVar);
                                continue;
                            }
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
        this.f5572A = iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f5578r;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1301b) arrayList.get(i7)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i9;
                        float f7 = i10;
                        float f8 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f7, f8, f7, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f7, f8, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f8, f7, paint);
                    }
                }
            }
        }
    }

    public final void e(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
        O o7 = this.f5576E;
        int i11 = o7.d;
        int resolveSizeAndState = View.resolveSizeAndState(i9 + o7.f10605c, i7, 0);
        int min = Math.min(this.f5582v, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f5583w, View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215);
        if (z7) {
            min |= 16777216;
        }
        if (z8) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f5584x = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, v.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        String str;
        int i7;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f15117a = -1;
        marginLayoutParams.f15119b = -1;
        marginLayoutParams.f15121c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.f15124e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f15127g = -1;
        marginLayoutParams.f15129h = -1;
        marginLayoutParams.f15131i = -1;
        marginLayoutParams.f15133j = -1;
        marginLayoutParams.f15135k = -1;
        marginLayoutParams.f15137l = -1;
        marginLayoutParams.f15138m = -1;
        marginLayoutParams.n = 0;
        marginLayoutParams.f15139o = 0.0f;
        marginLayoutParams.f15140p = -1;
        marginLayoutParams.f15141q = -1;
        marginLayoutParams.f15142r = -1;
        marginLayoutParams.f15143s = -1;
        marginLayoutParams.f15144t = -1;
        marginLayoutParams.f15145u = -1;
        marginLayoutParams.f15146v = -1;
        marginLayoutParams.f15147w = -1;
        marginLayoutParams.f15148x = -1;
        marginLayoutParams.f15149y = -1;
        marginLayoutParams.f15150z = 0.5f;
        marginLayoutParams.f15093A = 0.5f;
        marginLayoutParams.f15094B = null;
        marginLayoutParams.f15095C = 1;
        marginLayoutParams.f15096D = -1.0f;
        marginLayoutParams.f15097E = -1.0f;
        marginLayoutParams.F = 0;
        marginLayoutParams.f15098G = 0;
        marginLayoutParams.f15099H = 0;
        marginLayoutParams.f15100I = 0;
        marginLayoutParams.f15101J = 0;
        marginLayoutParams.f15102K = 0;
        marginLayoutParams.f15103L = 0;
        marginLayoutParams.f15104M = 0;
        marginLayoutParams.f15105N = 1.0f;
        marginLayoutParams.f15106O = 1.0f;
        marginLayoutParams.f15107P = -1;
        marginLayoutParams.f15108Q = -1;
        marginLayoutParams.f15109R = -1;
        marginLayoutParams.f15110S = false;
        marginLayoutParams.f15111T = false;
        marginLayoutParams.f15112U = null;
        marginLayoutParams.f15113V = true;
        marginLayoutParams.W = true;
        marginLayoutParams.f15114X = false;
        marginLayoutParams.f15115Y = false;
        marginLayoutParams.f15116Z = false;
        marginLayoutParams.f15118a0 = -1;
        marginLayoutParams.f15120b0 = -1;
        marginLayoutParams.f15122c0 = -1;
        marginLayoutParams.f15123d0 = -1;
        marginLayoutParams.f15125e0 = -1;
        marginLayoutParams.f15126f0 = -1;
        marginLayoutParams.f15128g0 = 0.5f;
        marginLayoutParams.f15136k0 = new C1218d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1313n.f15239b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = AbstractC1302c.f15092a.get(index);
            switch (i9) {
                case 1:
                    marginLayoutParams.f15109R = obtainStyledAttributes.getInt(index, marginLayoutParams.f15109R);
                    continue;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15138m);
                    marginLayoutParams.f15138m = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f15138m = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 3:
                    marginLayoutParams.n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.n);
                    continue;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15139o) % 360.0f;
                    marginLayoutParams.f15139o = f;
                    if (f < 0.0f) {
                        marginLayoutParams.f15139o = (360.0f - f) % 360.0f;
                    } else {
                        continue;
                    }
                case 5:
                    marginLayoutParams.f15117a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f15117a);
                    continue;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    marginLayoutParams.f15119b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f15119b);
                    continue;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    marginLayoutParams.f15121c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15121c);
                    continue;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.d);
                    marginLayoutParams.d = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.d = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15124e);
                    marginLayoutParams.f15124e = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f15124e = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15127g);
                    marginLayoutParams.f15127g = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f15127g = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15129h);
                    marginLayoutParams.f15129h = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f15129h = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15131i);
                    marginLayoutParams.f15131i = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f15131i = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15133j);
                    marginLayoutParams.f15133j = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f15133j = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15135k);
                    marginLayoutParams.f15135k = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f15135k = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15137l);
                    marginLayoutParams.f15137l = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f15137l = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15140p);
                    marginLayoutParams.f15140p = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f15140p = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15141q);
                    marginLayoutParams.f15141q = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f15141q = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15142r);
                    marginLayoutParams.f15142r = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f15142r = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f15143s);
                    marginLayoutParams.f15143s = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f15143s = obtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 21:
                    marginLayoutParams.f15144t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15144t);
                    continue;
                case 22:
                    marginLayoutParams.f15145u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15145u);
                    continue;
                case 23:
                    marginLayoutParams.f15146v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15146v);
                    continue;
                case 24:
                    marginLayoutParams.f15147w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15147w);
                    continue;
                case 25:
                    marginLayoutParams.f15148x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15148x);
                    continue;
                case 26:
                    marginLayoutParams.f15149y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15149y);
                    continue;
                case 27:
                    marginLayoutParams.f15110S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f15110S);
                    continue;
                case 28:
                    marginLayoutParams.f15111T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f15111T);
                    continue;
                case 29:
                    marginLayoutParams.f15150z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15150z);
                    continue;
                case 30:
                    marginLayoutParams.f15093A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15093A);
                    continue;
                case 31:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f15099H = i10;
                    if (i10 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    } else {
                        continue;
                    }
                case 32:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f15100I = i11;
                    if (i11 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    } else {
                        continue;
                    }
                case 33:
                    try {
                        marginLayoutParams.f15101J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15101J);
                        continue;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f15101J) == -2) {
                            marginLayoutParams.f15101J = -2;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f15103L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15103L);
                        continue;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f15103L) == -2) {
                            marginLayoutParams.f15103L = -2;
                        }
                    }
                case 35:
                    marginLayoutParams.f15105N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f15105N));
                    marginLayoutParams.f15099H = 2;
                    continue;
                case 36:
                    try {
                        marginLayoutParams.f15102K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15102K);
                        continue;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f15102K) == -2) {
                            marginLayoutParams.f15102K = -2;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f15104M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f15104M);
                        continue;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f15104M) == -2) {
                            marginLayoutParams.f15104M = -2;
                        }
                    }
                case 38:
                    marginLayoutParams.f15106O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f15106O));
                    marginLayoutParams.f15100I = 2;
                    continue;
                default:
                    switch (i9) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f15094B = string;
                            marginLayoutParams.f15095C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f15094B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i7 = 0;
                                } else {
                                    String substring = marginLayoutParams.f15094B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f15095C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f15095C = 1;
                                    }
                                    i7 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f15094B.indexOf(58);
                                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                    String substring2 = marginLayoutParams.f15094B.substring(i7);
                                    if (substring2.length() > 0) {
                                        Float.parseFloat(substring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String substring3 = marginLayoutParams.f15094B.substring(i7, indexOf2);
                                    String substring4 = marginLayoutParams.f15094B.substring(indexOf2 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring3);
                                            float parseFloat2 = Float.parseFloat(substring4);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f15095C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 45:
                            marginLayoutParams.f15096D = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15096D);
                            continue;
                        case 46:
                            marginLayoutParams.f15097E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f15097E);
                            continue;
                        case 47:
                            marginLayoutParams.F = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            marginLayoutParams.f15098G = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            marginLayoutParams.f15107P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f15107P);
                            continue;
                        case 50:
                            marginLayoutParams.f15108Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f15108Q);
                            continue;
                        case 51:
                            marginLayoutParams.f15112U = obtainStyledAttributes.getString(index);
                            continue;
                            continue;
                    }
                    break;
            }
            Log.e("ConstraintLayout", str);
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f5583w;
    }

    public int getMaxWidth() {
        return this.f5582v;
    }

    public int getMinHeight() {
        return this.f5581u;
    }

    public int getMinWidth() {
        return this.f5580t;
    }

    public int getOptimizationLevel() {
        return this.f5579s.f14508p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C1303d c1303d = (C1303d) childAt.getLayoutParams();
            C1218d c1218d = c1303d.f15136k0;
            if (childAt.getVisibility() != 8 || c1303d.f15115Y || c1303d.f15116Z || isInEditMode) {
                int k5 = c1218d.k();
                int l7 = c1218d.l();
                childAt.layout(k5, l7, c1218d.j() + k5, c1218d.g() + l7);
            }
        }
        ArrayList arrayList = this.f5578r;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((AbstractC1301b) arrayList.get(i12)).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x023b, code lost:
        if (r12 == 6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0c19, code lost:
        if (r3 != false) goto L587;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x07b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0c29  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r37, int r38) {
        /*
            Method dump skipped, instructions count: 3138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1218d b7 = b(view);
        if ((view instanceof Guideline) && !(b7 instanceof f)) {
            C1303d c1303d = (C1303d) view.getLayoutParams();
            f fVar = new f();
            c1303d.f15136k0 = fVar;
            c1303d.f15115Y = true;
            fVar.y(c1303d.f15109R);
        }
        if (view instanceof AbstractC1301b) {
            AbstractC1301b abstractC1301b = (AbstractC1301b) view;
            abstractC1301b.d();
            ((C1303d) view.getLayoutParams()).f15116Z = true;
            ArrayList arrayList = this.f5578r;
            if (!arrayList.contains(abstractC1301b)) {
                arrayList.add(abstractC1301b);
            }
        }
        this.f5577q.put(view.getId(), view);
        this.f5584x = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5577q.remove(view.getId());
        C1218d b7 = b(view);
        this.f5579s.f14496d0.remove(b7);
        b7.f14453I = null;
        this.f5578r.remove(view);
        this.f5584x = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5584x = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1310k c1310k) {
        this.f5586z = c1310k;
    }

    @Override // android.view.View
    public void setId(int i7) {
        int id = getId();
        SparseArray sparseArray = this.f5577q;
        sparseArray.remove(id);
        super.setId(i7);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f5583w) {
            return;
        }
        this.f5583w = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f5582v) {
            return;
        }
        this.f5582v = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f5581u) {
            return;
        }
        this.f5581u = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f5580t) {
            return;
        }
        this.f5580t = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1311l abstractC1311l) {
        i iVar = this.f5572A;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i7) {
        boolean z7;
        this.f5585y = i7;
        this.f5579s.f14508p0 = i7;
        if ((i7 & 256) == 256) {
            z7 = true;
        } else {
            z7 = false;
        }
        e.f13495p = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5577q = new SparseArray();
        this.f5578r = new ArrayList(4);
        this.f5579s = new C1219e();
        this.f5580t = 0;
        this.f5581u = 0;
        this.f5582v = Integer.MAX_VALUE;
        this.f5583w = Integer.MAX_VALUE;
        this.f5584x = true;
        this.f5585y = 263;
        this.f5586z = null;
        this.f5572A = null;
        this.f5573B = -1;
        this.f5574C = new HashMap();
        this.f5575D = new SparseArray();
        this.f5576E = new O(this);
        c(attributeSet, i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, v.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f15117a = -1;
        marginLayoutParams.f15119b = -1;
        marginLayoutParams.f15121c = -1.0f;
        marginLayoutParams.d = -1;
        marginLayoutParams.f15124e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.f15127g = -1;
        marginLayoutParams.f15129h = -1;
        marginLayoutParams.f15131i = -1;
        marginLayoutParams.f15133j = -1;
        marginLayoutParams.f15135k = -1;
        marginLayoutParams.f15137l = -1;
        marginLayoutParams.f15138m = -1;
        marginLayoutParams.n = 0;
        marginLayoutParams.f15139o = 0.0f;
        marginLayoutParams.f15140p = -1;
        marginLayoutParams.f15141q = -1;
        marginLayoutParams.f15142r = -1;
        marginLayoutParams.f15143s = -1;
        marginLayoutParams.f15144t = -1;
        marginLayoutParams.f15145u = -1;
        marginLayoutParams.f15146v = -1;
        marginLayoutParams.f15147w = -1;
        marginLayoutParams.f15148x = -1;
        marginLayoutParams.f15149y = -1;
        marginLayoutParams.f15150z = 0.5f;
        marginLayoutParams.f15093A = 0.5f;
        marginLayoutParams.f15094B = null;
        marginLayoutParams.f15095C = 1;
        marginLayoutParams.f15096D = -1.0f;
        marginLayoutParams.f15097E = -1.0f;
        marginLayoutParams.F = 0;
        marginLayoutParams.f15098G = 0;
        marginLayoutParams.f15099H = 0;
        marginLayoutParams.f15100I = 0;
        marginLayoutParams.f15101J = 0;
        marginLayoutParams.f15102K = 0;
        marginLayoutParams.f15103L = 0;
        marginLayoutParams.f15104M = 0;
        marginLayoutParams.f15105N = 1.0f;
        marginLayoutParams.f15106O = 1.0f;
        marginLayoutParams.f15107P = -1;
        marginLayoutParams.f15108Q = -1;
        marginLayoutParams.f15109R = -1;
        marginLayoutParams.f15110S = false;
        marginLayoutParams.f15111T = false;
        marginLayoutParams.f15112U = null;
        marginLayoutParams.f15113V = true;
        marginLayoutParams.W = true;
        marginLayoutParams.f15114X = false;
        marginLayoutParams.f15115Y = false;
        marginLayoutParams.f15116Z = false;
        marginLayoutParams.f15118a0 = -1;
        marginLayoutParams.f15120b0 = -1;
        marginLayoutParams.f15122c0 = -1;
        marginLayoutParams.f15123d0 = -1;
        marginLayoutParams.f15125e0 = -1;
        marginLayoutParams.f15126f0 = -1;
        marginLayoutParams.f15128g0 = 0.5f;
        marginLayoutParams.f15136k0 = new C1218d();
        return marginLayoutParams;
    }
}
