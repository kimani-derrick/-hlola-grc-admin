package i4;

import O3.H;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.android.gms.internal.measurement.C0445k0;
import com.google.android.gms.internal.measurement.C0450l0;
import g3.n;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import l4.C0973a;
import l4.C0975c;
import l4.InterfaceC0974b;
import m4.AbstractC0996a;
import s3.AbstractC1204v0;
/* renamed from: i4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774c {

    /* renamed from: a  reason: collision with root package name */
    public final M4.b f11371a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11372b = "frc";

    /* renamed from: c  reason: collision with root package name */
    public Integer f11373c = null;

    public C0774c(M4.b bVar) {
        this.f11371a = bVar;
    }

    public static boolean a(ArrayList arrayList, C0773b c0773b) {
        String str = c0773b.f11367a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0773b c0773b2 = (C0773b) it.next();
            if (c0773b2.f11367a.equals(str) && c0773b2.f11368b.equals(c0773b.f11368b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, l4.a] */
    public final ArrayList b() {
        C0975c c0975c = (C0975c) ((InterfaceC0974b) this.f11371a.get());
        c0975c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((C0430h0) c0975c.f12266a.f11874r).c(this.f11372b, "")) {
            H h7 = AbstractC0996a.f12433a;
            n.g(bundle);
            ?? obj = new Object();
            String str = (String) AbstractC1204v0.a(bundle, "origin", String.class, null);
            n.g(str);
            obj.f12253a = str;
            String str2 = (String) AbstractC1204v0.a(bundle, "name", String.class, null);
            n.g(str2);
            obj.f12254b = str2;
            obj.f12255c = AbstractC1204v0.a(bundle, "value", Object.class, null);
            obj.d = (String) AbstractC1204v0.a(bundle, "trigger_event_name", String.class, null);
            obj.f12256e = ((Long) AbstractC1204v0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f = (String) AbstractC1204v0.a(bundle, "timed_out_event_name", String.class, null);
            obj.f12257g = (Bundle) AbstractC1204v0.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.f12258h = (String) AbstractC1204v0.a(bundle, "triggered_event_name", String.class, null);
            obj.f12259i = (Bundle) AbstractC1204v0.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.f12260j = ((Long) AbstractC1204v0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.f12261k = (String) AbstractC1204v0.a(bundle, "expired_event_name", String.class, null);
            obj.f12262l = (Bundle) AbstractC1204v0.a(bundle, "expired_event_params", Bundle.class, null);
            obj.n = ((Boolean) AbstractC1204v0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f12263m = ((Long) AbstractC1204v0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f12264o = ((Long) AbstractC1204v0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        String str;
        String str2;
        M4.b bVar = this.f11371a;
        if (bVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str3 = "";
                if (it.hasNext()) {
                    Map map = (Map) it.next();
                    String[] strArr = C0773b.f11365g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = C0773b.f11365g;
                    for (int i7 = 0; i7 < 5; i7++) {
                        String str4 = strArr2[i7];
                        if (!map.containsKey(str4)) {
                            arrayList3.add(str4);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = C0773b.f11366h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str5 = (String) map.get("experimentId");
                            String str6 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str3 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new C0773b(str5, str6, str3, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e3) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e3);
                        } catch (ParseException e7) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e7);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else if (arrayList2.isEmpty()) {
                    if (bVar.get() != null) {
                        Iterator it2 = b().iterator();
                        while (it2.hasNext()) {
                            String str7 = ((C0973a) it2.next()).f12254b;
                            C0430h0 c0430h0 = (C0430h0) ((C0975c) ((InterfaceC0974b) bVar.get())).f12266a.f11874r;
                            c0430h0.getClass();
                            c0430h0.e(new C0445k0(c0430h0, str7, null, null, 0));
                        }
                        return;
                    }
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                } else if (bVar.get() != null) {
                    ArrayList b7 = b();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = b7.iterator();
                    while (it3.hasNext()) {
                        C0973a c0973a = (C0973a) it3.next();
                        String[] strArr3 = C0773b.f11365g;
                        String str8 = c0973a.d;
                        if (str8 == null) {
                            str2 = "";
                        } else {
                            str2 = str8;
                        }
                        arrayList4.add(new C0773b(c0973a.f12254b, String.valueOf(c0973a.f12255c), str2, new Date(c0973a.f12263m), c0973a.f12256e, c0973a.f12260j));
                        bVar = bVar;
                    }
                    M4.b bVar2 = bVar;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        boolean hasNext = it4.hasNext();
                        str = this.f11372b;
                        if (!hasNext) {
                            break;
                        }
                        C0773b c0773b = (C0773b) it4.next();
                        if (!a(arrayList2, c0773b)) {
                            arrayList5.add(c0773b.a(str));
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        String str9 = ((C0973a) it5.next()).f12254b;
                        C0430h0 c0430h02 = (C0430h0) ((C0975c) ((InterfaceC0974b) bVar2.get())).f12266a.f11874r;
                        c0430h02.getClass();
                        c0430h02.e(new C0445k0(c0430h02, str9, null, null, 0));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        C0773b c0773b2 = (C0773b) it6.next();
                        if (!a(arrayList4, c0773b2)) {
                            arrayList6.add(c0773b2);
                        }
                    }
                    ArrayDeque arrayDeque = new ArrayDeque(b());
                    if (this.f11373c == null) {
                        this.f11373c = Integer.valueOf(((C0430h0) ((C0975c) ((InterfaceC0974b) bVar2.get())).f12266a.f11874r).a(str));
                    }
                    int intValue = this.f11373c.intValue();
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        C0773b c0773b3 = (C0773b) it7.next();
                        while (arrayDeque.size() >= intValue) {
                            String str10 = ((C0973a) arrayDeque.pollFirst()).f12254b;
                            C0430h0 c0430h03 = (C0430h0) ((C0975c) ((InterfaceC0974b) bVar2.get())).f12266a.f11874r;
                            c0430h03.getClass();
                            c0430h03.e(new C0445k0(c0430h03, str10, null, null, 0));
                        }
                        C0973a a7 = c0773b3.a(str);
                        C0975c c0975c = (C0975c) ((InterfaceC0974b) bVar2.get());
                        c0975c.getClass();
                        if (AbstractC0996a.c(a7)) {
                            Bundle bundle = new Bundle();
                            String str11 = a7.f12253a;
                            if (str11 != null) {
                                bundle.putString("origin", str11);
                            }
                            String str12 = a7.f12254b;
                            if (str12 != null) {
                                bundle.putString("name", str12);
                            }
                            Object obj = a7.f12255c;
                            if (obj != null) {
                                AbstractC1204v0.e(bundle, obj);
                            }
                            String str13 = a7.d;
                            if (str13 != null) {
                                bundle.putString("trigger_event_name", str13);
                            }
                            bundle.putLong("trigger_timeout", a7.f12256e);
                            String str14 = a7.f;
                            if (str14 != null) {
                                bundle.putString("timed_out_event_name", str14);
                            }
                            Bundle bundle2 = a7.f12257g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str15 = a7.f12258h;
                            if (str15 != null) {
                                bundle.putString("triggered_event_name", str15);
                            }
                            Bundle bundle3 = a7.f12259i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", a7.f12260j);
                            String str16 = a7.f12261k;
                            if (str16 != null) {
                                bundle.putString("expired_event_name", str16);
                            }
                            Bundle bundle4 = a7.f12262l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", a7.f12263m);
                            bundle.putBoolean("active", a7.n);
                            bundle.putLong("triggered_timestamp", a7.f12264o);
                            C0430h0 c0430h04 = (C0430h0) c0975c.f12266a.f11874r;
                            c0430h04.getClass();
                            c0430h04.e(new C0450l0(c0430h04, bundle, 0));
                        }
                        arrayDeque.offer(a7);
                    }
                    return;
                } else {
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
