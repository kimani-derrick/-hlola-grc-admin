package androidx.fragment.app;

import a.AbstractC0189a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import z5.C1524f;
/* loaded from: classes.dex */
public final class K extends p6.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f5899r;

    public /* synthetic */ K(int i7) {
        this.f5899r = i7;
    }

    @Override // p6.l
    public final Object D(Intent intent, int i7) {
        boolean z7;
        switch (this.f5899r) {
            case 0:
                return new androidx.activity.result.a(intent, i7);
            case 1:
                A5.u uVar = A5.u.f136q;
                if (i7 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i8 : intArrayExtra) {
                            if (i8 == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            arrayList.add(Boolean.valueOf(z7));
                        }
                        ArrayList W = A5.j.W(stringArrayExtra);
                        Iterator it = W.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(A5.m.P(W), A5.m.P(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C1524f(it.next(), it2.next()));
                        }
                        return A5.w.M(arrayList2);
                    }
                    return uVar;
                }
                return uVar;
            case 2:
                if (intent != null && i7 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z8 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                if (intArrayExtra2[i9] == 0) {
                                    z8 = true;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z8);
                }
                return Boolean.FALSE;
            default:
                return new androidx.activity.result.a(intent, i7);
        }
    }

    @Override // p6.l
    public final Intent n(androidx.activity.l lVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f5899r) {
            case 0:
                androidx.activity.result.i iVar = (androidx.activity.result.i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.f5371r;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f5370q;
                        M5.g.f(intentSender, "intentSender");
                        iVar = new androidx.activity.result.i(intentSender, null, iVar.f5372s, iVar.f5373t);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                M5.g.f(lVar, "context");
                M5.g.f(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                M5.g.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String str = (String) obj;
                M5.g.f(lVar, "context");
                M5.g.f(str, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                M5.g.e(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            default:
                Intent intent3 = (Intent) obj;
                M5.g.f(lVar, "context");
                M5.g.f(intent3, "input");
                return intent3;
        }
    }

    @Override // p6.l
    public K3.f x(androidx.activity.l lVar, Object obj) {
        switch (this.f5899r) {
            case 1:
                String[] strArr = (String[]) obj;
                M5.g.f(lVar, "context");
                M5.g.f(strArr, "input");
                if (strArr.length == 0) {
                    return new K3.f(A5.u.f136q);
                }
                for (String str : strArr) {
                    if (AbstractC0189a.n(lVar, str) != 0) {
                        return null;
                    }
                }
                int J6 = A5.w.J(strArr.length);
                if (J6 < 16) {
                    J6 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(J6);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new K3.f(linkedHashMap);
            case 2:
                String str3 = (String) obj;
                M5.g.f(lVar, "context");
                M5.g.f(str3, "input");
                if (AbstractC0189a.n(lVar, str3) == 0) {
                    return new K3.f(Boolean.TRUE);
                }
                return null;
            default:
                return super.x(lVar, obj);
        }
    }
}
