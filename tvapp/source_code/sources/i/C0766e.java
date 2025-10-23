package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e.AbstractC0565a;
import j.j;
import java.io.IOException;
import k.AbstractC0869T;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: i.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766e extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f11307e;
    public static final Class[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11308a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f11309b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11310c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f11307e = clsArr;
        f = clsArr;
    }

    public C0766e(Context context) {
        super(context);
        this.f11310c = context;
        Object[] objArr = {context};
        this.f11308a = objArr;
        this.f11309b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        int i7;
        boolean z7;
        char charAt;
        char charAt2;
        int i8;
        boolean z8;
        PorterDuff.Mode mode;
        ColorStateList colorStateList;
        int resourceId;
        C0765d c0765d = new C0765d(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i7 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType != r42) {
                if (eventType != i7) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z10 && name2.equals(str)) {
                            z7 = r42;
                            z10 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            r42 = z7;
                            i7 = 2;
                        } else if (name2.equals("group")) {
                            c0765d.f11285b = 0;
                            c0765d.f11286c = 0;
                            c0765d.d = 0;
                            c0765d.f11287e = 0;
                            c0765d.f = r42;
                            c0765d.f11288g = r42;
                        } else if (name2.equals("item")) {
                            if (!c0765d.f11289h) {
                                c0765d.f11289h = r42;
                                c0765d.b(c0765d.f11284a.add(c0765d.f11285b, c0765d.f11290i, c0765d.f11291j, c0765d.f11292k));
                            }
                        } else if (name2.equals("menu")) {
                            z7 = r42;
                            z9 = z7;
                        }
                    }
                    z7 = r42;
                } else {
                    if (!z10) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals("group");
                        C0766e c0766e = c0765d.f11283D;
                        if (equals) {
                            TypedArray obtainStyledAttributes = c0766e.f11310c.obtainStyledAttributes(attributeSet, AbstractC0565a.f9351m);
                            c0765d.f11285b = obtainStyledAttributes.getResourceId(r42, 0);
                            c0765d.f11286c = obtainStyledAttributes.getInt(3, 0);
                            c0765d.d = obtainStyledAttributes.getInt(4, 0);
                            c0765d.f11287e = obtainStyledAttributes.getInt(5, 0);
                            c0765d.f = obtainStyledAttributes.getBoolean(2, r42);
                            c0765d.f11288g = obtainStyledAttributes.getBoolean(0, r42);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                Context context = c0766e.f11310c;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0565a.n);
                                c0765d.f11290i = obtainStyledAttributes2.getResourceId(2, 0);
                                c0765d.f11291j = (obtainStyledAttributes2.getInt(5, c0765d.f11286c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0765d.d) & 65535);
                                c0765d.f11292k = obtainStyledAttributes2.getText(7);
                                c0765d.f11293l = obtainStyledAttributes2.getText(8);
                                c0765d.f11294m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                c0765d.n = charAt;
                                c0765d.f11295o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                c0765d.f11296p = charAt2;
                                c0765d.f11297q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    i8 = obtainStyledAttributes2.getBoolean(11, false);
                                } else {
                                    i8 = c0765d.f11287e;
                                }
                                c0765d.f11298r = i8;
                                c0765d.f11299s = obtainStyledAttributes2.getBoolean(3, false);
                                c0765d.f11300t = obtainStyledAttributes2.getBoolean(4, c0765d.f);
                                c0765d.f11301u = obtainStyledAttributes2.getBoolean(1, c0765d.f11288g);
                                c0765d.f11302v = obtainStyledAttributes2.getInt(21, -1);
                                c0765d.f11305y = obtainStyledAttributes2.getString(12);
                                c0765d.f11303w = obtainStyledAttributes2.getResourceId(13, 0);
                                c0765d.f11304x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8 && c0765d.f11303w == 0 && c0765d.f11304x == null) {
                                    AbstractC0515y1.v(c0765d.a(string3, f, c0766e.f11309b));
                                } else if (z8) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0765d.f11306z = obtainStyledAttributes2.getText(17);
                                c0765d.f11280A = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    mode = AbstractC0869T.b(obtainStyledAttributes2.getInt(19, -1), c0765d.f11282C);
                                } else {
                                    mode = null;
                                }
                                c0765d.f11282C = mode;
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = android.support.v4.media.session.b.h0(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    c0765d.f11281B = colorStateList;
                                } else {
                                    c0765d.f11281B = null;
                                }
                                obtainStyledAttributes2.recycle();
                                c0765d.f11289h = false;
                                z7 = true;
                            } else if (name3.equals("menu")) {
                                z7 = true;
                                c0765d.f11289h = true;
                                SubMenu addSubMenu = c0765d.f11284a.addSubMenu(c0765d.f11285b, c0765d.f11290i, c0765d.f11291j, c0765d.f11292k);
                                c0765d.b(addSubMenu.getItem());
                                b(xmlResourceParser, attributeSet, addSubMenu);
                            } else {
                                z7 = true;
                                str = name3;
                                z10 = true;
                            }
                            eventType = xmlResourceParser.next();
                            r42 = z7;
                            i7 = 2;
                        }
                    }
                    z7 = r42;
                }
                eventType = xmlResourceParser.next();
                r42 = z7;
                i7 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11310c.getResources().getLayout(i7);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
