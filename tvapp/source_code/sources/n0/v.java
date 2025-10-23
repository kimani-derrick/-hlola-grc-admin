package n0;

import a.AbstractC0189a;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.AbstractC1055a;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f12599z = 0;

    /* renamed from: q  reason: collision with root package name */
    public final String f12600q;

    /* renamed from: r  reason: collision with root package name */
    public y f12601r;

    /* renamed from: s  reason: collision with root package name */
    public String f12602s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f12603t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f12604u;

    /* renamed from: v  reason: collision with root package name */
    public final o.k f12605v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f12606w;

    /* renamed from: x  reason: collision with root package name */
    public int f12607x;

    /* renamed from: y  reason: collision with root package name */
    public String f12608y;

    static {
        new LinkedHashMap();
    }

    public v(N n) {
        M5.g.f(n, "navigator");
        LinkedHashMap linkedHashMap = O.f12513b;
        this.f12600q = m3.g.u(n.getClass());
        this.f12604u = new ArrayList();
        this.f12605v = new o.k(0);
        this.f12606w = new LinkedHashMap();
    }

    public final void b(t tVar) {
        Map N6 = A5.w.N(this.f12606w);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : N6.entrySet()) {
            C1018i c1018i = (C1018i) entry.getValue();
            if (!c1018i.f12538b && !c1018i.f12539c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            ArrayList arrayList2 = tVar.d;
            ArrayList arrayList3 = new ArrayList();
            for (r rVar : tVar.f12587e.values()) {
                A5.q.R(rVar.f12580b, arrayList3);
            }
            if (!A5.k.e0(arrayList2, arrayList3).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f12604u.add(tVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + tVar.f12584a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f12606w;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C1018i c1018i = (C1018i) entry.getValue();
            c1018i.getClass();
            M5.g.f(str, "name");
            if (c1018i.f12539c) {
                c1018i.f12537a.d(bundle2, str, c1018i.d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C1018i c1018i2 = (C1018i) entry2.getValue();
                c1018i2.getClass();
                M5.g.f(str2, "name");
                boolean z7 = c1018i2.f12538b;
                L l7 = c1018i2.f12537a;
                if (z7 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        l7.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder u7 = AbstractC1111a.u("Wrong argument type for '", str2, "' in argument bundle. ");
                u7.append(l7.b());
                u7.append(" expected.");
                throw new IllegalArgumentException(u7.toString().toString());
            }
        }
        return bundle2;
    }

    public boolean equals(Object obj) {
        boolean z7;
        boolean z8;
        boolean z9;
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        ArrayList arrayList = this.f12604u;
        v vVar = (v) obj;
        ArrayList arrayList2 = vVar.f12604u;
        M5.g.f(arrayList, "<this>");
        M5.g.f(arrayList2, "other");
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        linkedHashSet.retainAll(arrayList2);
        if (linkedHashSet.size() == arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        o.k kVar = this.f12605v;
        int k5 = kVar.k();
        o.k kVar2 = vVar.f12605v;
        if (k5 == kVar2.k()) {
            Iterator it = T5.j.J(o.h.c(kVar)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!kVar2.d((C1015f) it.next())) {
                        break;
                    }
                } else {
                    for (C1015f c1015f : T5.j.J(o.h.c(kVar2))) {
                        if (!kVar.d(c1015f)) {
                        }
                    }
                    z8 = true;
                }
            }
            z8 = false;
        } else {
            z8 = false;
        }
        LinkedHashMap linkedHashMap = this.f12606w;
        int size = A5.w.N(linkedHashMap).size();
        LinkedHashMap linkedHashMap2 = vVar.f12606w;
        if (size == A5.w.N(linkedHashMap2).size()) {
            Set entrySet = A5.w.N(linkedHashMap).entrySet();
            M5.g.f(entrySet, "<this>");
            Iterator it2 = entrySet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (A5.w.N(linkedHashMap2).containsKey(entry.getKey())) {
                        if (!M5.g.a(A5.w.N(linkedHashMap2).get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    Set<Map.Entry> entrySet2 = A5.w.N(linkedHashMap2).entrySet();
                    M5.g.f(entrySet2, "<this>");
                    for (Map.Entry entry2 : entrySet2) {
                        if (A5.w.N(linkedHashMap).containsKey(entry2.getKey())) {
                            if (!M5.g.a(A5.w.N(linkedHashMap).get(entry2.getKey()), entry2.getValue())) {
                            }
                        }
                    }
                    z9 = true;
                }
            }
        }
        z9 = false;
        if (this.f12607x != vVar.f12607x || !M5.g.a(this.f12608y, vVar.f12608y) || !z7 || !z8 || !z9) {
            return false;
        }
        return true;
    }

    public final C1015f f(int i7) {
        boolean z7;
        C1015f c1015f;
        o.k kVar = this.f12605v;
        if (kVar.k() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            c1015f = null;
        } else {
            c1015f = (C1015f) kVar.e(i7);
        }
        if (c1015f == null) {
            y yVar = this.f12601r;
            if (yVar == null) {
                return null;
            }
            return yVar.f(i7);
        }
        return c1015f;
    }

    public u g(g5.b bVar) {
        Bundle bundle;
        boolean z7;
        int i7;
        u uVar;
        List list;
        List list2;
        List list3;
        Matcher matcher;
        Bundle bundle2;
        Matcher matcher2;
        LinkedHashMap linkedHashMap;
        Uri uri;
        Iterator it;
        String str;
        v vVar = this;
        ArrayList arrayList = vVar.f12604u;
        Matcher matcher3 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        u uVar2 = null;
        while (it2.hasNext()) {
            t tVar = (t) it2.next();
            Uri uri2 = (Uri) bVar.f10841r;
            if (uri2 != null) {
                Map N6 = A5.w.N(vVar.f12606w);
                tVar.getClass();
                Pattern pattern = (Pattern) tVar.f12588g.getValue();
                if (pattern != null) {
                    matcher = pattern.matcher(uri2.toString());
                } else {
                    matcher = matcher3;
                }
                if (matcher == null || !matcher.matches()) {
                    bundle2 = matcher3;
                } else {
                    bundle2 = new Bundle();
                    ArrayList arrayList2 = tVar.d;
                    int size = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size) {
                        String str2 = (String) arrayList2.get(i8);
                        i8++;
                        String decode = Uri.decode(matcher.group(i8));
                        C1018i c1018i = (C1018i) N6.get(str2);
                        try {
                            M5.g.e(decode, "value");
                            t.b(bundle2, str2, decode, c1018i);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (tVar.f12589h) {
                        LinkedHashMap linkedHashMap2 = tVar.f12587e;
                        Iterator it3 = linkedHashMap2.keySet().iterator();
                        while (it3.hasNext()) {
                            String str3 = (String) it3.next();
                            r rVar = (r) linkedHashMap2.get(str3);
                            String queryParameter = uri2.getQueryParameter(str3);
                            if (tVar.f12590i) {
                                String uri3 = uri2.toString();
                                M5.g.e(uri3, "deepLink.toString()");
                                String w02 = U5.f.w0(uri3, '?');
                                if (!M5.g.a(w02, uri3)) {
                                    queryParameter = w02;
                                }
                            }
                            if (queryParameter != null) {
                                M5.g.c(rVar);
                                matcher2 = Pattern.compile(rVar.f12579a, 32).matcher(queryParameter);
                                if (!matcher2.matches()) {
                                    break;
                                }
                            } else {
                                matcher2 = null;
                            }
                            Bundle bundle3 = new Bundle();
                            try {
                                M5.g.c(rVar);
                                ArrayList arrayList3 = rVar.f12580b;
                                int size2 = arrayList3.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    if (matcher2 != null) {
                                        str = matcher2.group(i9 + 1);
                                        if (str == null) {
                                            str = "";
                                        }
                                    } else {
                                        str = null;
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        String str4 = (String) arrayList3.get(i9);
                                        uri = uri2;
                                        try {
                                            C1018i c1018i2 = (C1018i) N6.get(str4);
                                            if (str != null) {
                                                it = it3;
                                                try {
                                                    if (!M5.g.a(str, '{' + str4 + '}')) {
                                                        t.b(bundle3, str4, str, c1018i2);
                                                    }
                                                } catch (IllegalArgumentException unused2) {
                                                }
                                            } else {
                                                it = it3;
                                            }
                                            i9++;
                                            it3 = it;
                                            linkedHashMap2 = linkedHashMap;
                                            uri2 = uri;
                                        } catch (IllegalArgumentException unused3) {
                                            it = it3;
                                            it3 = it;
                                            linkedHashMap2 = linkedHashMap;
                                            uri2 = uri;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        uri = uri2;
                                        it = it3;
                                        it3 = it;
                                        linkedHashMap2 = linkedHashMap;
                                        uri2 = uri;
                                    }
                                }
                                linkedHashMap = linkedHashMap2;
                                uri = uri2;
                                it = it3;
                                bundle2.putAll(bundle3);
                            } catch (IllegalArgumentException unused5) {
                                linkedHashMap = linkedHashMap2;
                            }
                            it3 = it;
                            linkedHashMap2 = linkedHashMap;
                            uri2 = uri;
                        }
                    }
                    for (Map.Entry entry : N6.entrySet()) {
                        String str5 = (String) entry.getKey();
                        C1018i c1018i3 = (C1018i) entry.getValue();
                        if (c1018i3 != null && !c1018i3.f12538b && !c1018i3.f12539c && !bundle2.containsKey(str5)) {
                            bundle2 = null;
                        }
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str6 = (String) bVar.f10842s;
            if (str6 != null && M5.g.a(str6, tVar.f12585b)) {
                z7 = true;
            } else {
                z7 = false;
            }
            String str7 = (String) bVar.f10843t;
            if (str7 != null) {
                tVar.getClass();
                String str8 = tVar.f12586c;
                if (str8 != null) {
                    Pattern pattern2 = (Pattern) tVar.f12592k.getValue();
                    M5.g.c(pattern2);
                    if (pattern2.matcher(str7).matches()) {
                        Pattern compile = Pattern.compile("/");
                        M5.g.e(compile, "compile(...)");
                        U5.f.r0(0);
                        Matcher matcher4 = compile.matcher(str8);
                        if (!matcher4.find()) {
                            list = m3.g.z(str8.toString());
                        } else {
                            ArrayList arrayList4 = new ArrayList(10);
                            int i10 = 0;
                            while (true) {
                                arrayList4.add(str8.subSequence(i10, matcher4.start()).toString());
                                i10 = matcher4.end();
                                if (!matcher4.find()) {
                                    break;
                                }
                            }
                            arrayList4.add(str8.subSequence(i10, str8.length()).toString());
                            list = arrayList4;
                        }
                        boolean isEmpty = list.isEmpty();
                        List list4 = A5.t.f135q;
                        if (!isEmpty) {
                            ListIterator listIterator = list.listIterator(list.size());
                            while (listIterator.hasPrevious()) {
                                if (((String) listIterator.previous()).length() != 0) {
                                    list2 = A5.k.i0(list, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        list2 = list4;
                        String str9 = (String) list2.get(0);
                        String str10 = (String) list2.get(1);
                        Pattern compile2 = Pattern.compile("/");
                        M5.g.e(compile2, "compile(...)");
                        U5.f.r0(0);
                        Matcher matcher5 = compile2.matcher(str7);
                        if (!matcher5.find()) {
                            list3 = m3.g.z(str7.toString());
                        } else {
                            ArrayList arrayList5 = new ArrayList(10);
                            int i11 = 0;
                            do {
                                arrayList5.add(str7.subSequence(i11, matcher5.start()).toString());
                                i11 = matcher5.end();
                            } while (matcher5.find());
                            arrayList5.add(str7.subSequence(i11, str7.length()).toString());
                            list3 = arrayList5;
                        }
                        if (!list3.isEmpty()) {
                            ListIterator listIterator2 = list3.listIterator(list3.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    if (((String) listIterator2.previous()).length() != 0) {
                                        list4 = A5.k.i0(list3, listIterator2.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        List list5 = list4;
                        String str11 = (String) list5.get(1);
                        if (M5.g.a(str9, (String) list5.get(0))) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        if (M5.g.a(str10, str11)) {
                            i7++;
                        }
                        if (bundle == null || z7 || i7 > -1) {
                            uVar = new u(this, bundle, tVar.f12593l, z7, i7);
                            if (uVar2 != null || uVar.compareTo(uVar2) > 0) {
                                matcher3 = null;
                                uVar2 = uVar;
                                vVar = this;
                            }
                        }
                        matcher3 = null;
                        vVar = this;
                    }
                }
            }
            i7 = -1;
            if (bundle == null) {
            }
            uVar = new u(this, bundle, tVar.f12593l, z7, i7);
            if (uVar2 != null) {
            }
            matcher3 = null;
            uVar2 = uVar;
            vVar = this;
        }
        return uVar2;
    }

    public void h(Context context, AttributeSet attributeSet) {
        Object obj;
        String str;
        M5.g.f(context, "context");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1055a.f12817e);
        M5.g.e(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f12607x = 0;
            this.f12602s = null;
        } else if (!U5.n.X(string)) {
            String concat = "android-app://androidx.navigation/".concat(string);
            this.f12607x = concat.hashCode();
            this.f12602s = null;
            b(new t(concat, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f12604u;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((t) obj).f12584a;
                String str3 = this.f12608y;
                if (str3 != null) {
                    str = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str = "";
                }
                if (M5.g.a(str2, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        M5.r.a(arrayList);
        arrayList.remove(obj);
        this.f12608y = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f12607x = resourceId;
            this.f12602s = null;
            this.f12602s = AbstractC0189a.u(context, resourceId);
        }
        this.f12603t = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public int hashCode() {
        int i7;
        int i8;
        int i9;
        Set<String> keySet;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f12607x * 31;
        String str = this.f12608y;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = i14 + i7;
        Iterator it = this.f12604u.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            int i16 = i15 * 31;
            String str2 = tVar.f12584a;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 31;
            String str3 = tVar.f12585b;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 31;
            String str4 = tVar.f12586c;
            if (str4 != null) {
                i13 = str4.hashCode();
            } else {
                i13 = 0;
            }
            i15 = i18 + i13;
        }
        A5.b c5 = o.h.c(this.f12605v);
        while (c5.hasNext()) {
            C1015f c1015f = (C1015f) c5.next();
            int i19 = ((i15 * 31) + c1015f.f12532a) * 31;
            C1002D c1002d = c1015f.f12533b;
            if (c1002d != null) {
                i9 = c1002d.hashCode();
            } else {
                i9 = 0;
            }
            i15 = i19 + i9;
            Bundle bundle = c1015f.f12534c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str5 : keySet) {
                    int i20 = i15 * 31;
                    Bundle bundle2 = c1015f.f12534c;
                    M5.g.c(bundle2);
                    Object obj = bundle2.get(str5);
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    i15 = i20 + i10;
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f12606w;
        for (String str6 : A5.w.N(linkedHashMap).keySet()) {
            int i21 = AbstractC0515y1.i(i15 * 31, 31, str6);
            Object obj2 = A5.w.N(linkedHashMap).get(str6);
            if (obj2 != null) {
                i8 = obj2.hashCode();
            } else {
                i8 = 0;
            }
            i15 = i21 + i8;
        }
        return i15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f12602s;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f12607x);
        }
        sb.append(str);
        sb.append(")");
        String str2 = this.f12608y;
        if (str2 != null && !U5.n.X(str2)) {
            sb.append(" route=");
            sb.append(this.f12608y);
        }
        if (this.f12603t != null) {
            sb.append(" label=");
            sb.append(this.f12603t);
        }
        String sb2 = sb.toString();
        M5.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
