package s3;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.boxhdo.android.tv.R;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import r0.AbstractC1111a;
/* renamed from: s3.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1204v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f14359a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f14360b = {"ad_impression"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f14361c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f14362e = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "deep_link_gclid", "market_referrer_gclid", "gbraid", "deep_link_gbraid", "market_referrer_gbraid", "session_number", "session_id"};
    public static final String[] f = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_dl_gclid", "_mr_gclid", "_gbraid", "_dl_gbraid", "_mr_gbraid", "_sno", "_sid"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f14363g = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f14364h = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f14365i = {"items"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f14366j = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: k  reason: collision with root package name */
    public static m3.i f14367k;

    public static Object a(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder("Invalid conditional user property field type. '");
        sb.append(str);
        sb.append("' expected [");
        sb.append(canonicalName);
        sb.append("] but was [");
        throw new IllegalStateException(AbstractC1111a.t(sb, canonicalName2, "]"));
    }

    public static String b(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }

    public static HashSet d(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void e(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void f(C1154I c1154i, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        int i7 = com.google.android.gms.internal.measurement.N.f8382a;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        l6.b bVar = c1154i.f13810y;
        if (!readable) {
            bVar.d("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            bVar.d("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            bVar.d("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            bVar.d("Failed to turn on database write permission for owner");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        r11.execSQL(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r13 = d(r11, r12);
        r14 = r14.split(",");
        r1 = r14.length;
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3 >= r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        r4 = r14[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r13.remove(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        throw new android.database.sqlite.SQLiteException("Table " + r12 + " is missing required column: " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r15 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r2 >= r15.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r13.remove(r15[r2]) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        r11.execSQL(r15[r2 + 1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        r2 = r2 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r13.isEmpty() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        r0.b(r12, android.text.TextUtils.join(", ", r13), "Table has extra columns. table, columns");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        r10.f13807v.c(r12, "Failed to verify columns on table that was just created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r2 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(s3.C1154I r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            l6.b r0 = r10.f13810y
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r2 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L26
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L26
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L26
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L26
            r1.close()
            if (r2 != 0) goto L34
            goto L31
        L23:
            r10 = move-exception
            goto L9d
        L26:
            r2 = move-exception
            java.lang.String r3 = "Error querying for table"
            r0.b(r12, r2, r3)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L31
            r1.close()
        L31:
            r11.execSQL(r13)
        L34:
            java.util.HashSet r13 = d(r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L6a
            java.lang.String r1 = ","
            java.lang.String[] r14 = r14.split(r1)     // Catch: android.database.sqlite.SQLiteException -> L6a
            int r1 = r14.length     // Catch: android.database.sqlite.SQLiteException -> L6a
            r2 = 0
            r3 = r2
        L41:
            if (r3 >= r1) goto L6c
            r4 = r14[r3]     // Catch: android.database.sqlite.SQLiteException -> L6a
            boolean r5 = r13.remove(r4)     // Catch: android.database.sqlite.SQLiteException -> L6a
            if (r5 == 0) goto L4e
            int r3 = r3 + 1
            goto L41
        L4e:
            android.database.sqlite.SQLiteException r11 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> L6a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L6a
            java.lang.String r14 = "Table "
            r13.<init>(r14)     // Catch: android.database.sqlite.SQLiteException -> L6a
            r13.append(r12)     // Catch: android.database.sqlite.SQLiteException -> L6a
            java.lang.String r14 = " is missing required column: "
            r13.append(r14)     // Catch: android.database.sqlite.SQLiteException -> L6a
            r13.append(r4)     // Catch: android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = r13.toString()     // Catch: android.database.sqlite.SQLiteException -> L6a
            r11.<init>(r13)     // Catch: android.database.sqlite.SQLiteException -> L6a
            throw r11     // Catch: android.database.sqlite.SQLiteException -> L6a
        L6a:
            r11 = move-exception
            goto L95
        L6c:
            if (r15 == 0) goto L83
        L6e:
            int r14 = r15.length     // Catch: android.database.sqlite.SQLiteException -> L6a
            if (r2 >= r14) goto L83
            r14 = r15[r2]     // Catch: android.database.sqlite.SQLiteException -> L6a
            boolean r14 = r13.remove(r14)     // Catch: android.database.sqlite.SQLiteException -> L6a
            if (r14 != 0) goto L80
            int r14 = r2 + 1
            r14 = r15[r14]     // Catch: android.database.sqlite.SQLiteException -> L6a
            r11.execSQL(r14)     // Catch: android.database.sqlite.SQLiteException -> L6a
        L80:
            int r2 = r2 + 2
            goto L6e
        L83:
            boolean r11 = r13.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L6a
            if (r11 != 0) goto L94
            java.lang.String r11 = "Table has extra columns. table, columns"
            java.lang.String r14 = ", "
            java.lang.String r13 = android.text.TextUtils.join(r14, r13)     // Catch: android.database.sqlite.SQLiteException -> L6a
            r0.b(r12, r13, r11)     // Catch: android.database.sqlite.SQLiteException -> L6a
        L94:
            return
        L95:
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            l6.b r10 = r10.f13807v
            r10.c(r12, r13)
            throw r11
        L9d:
            if (r1 == 0) goto La2
            r1.close()
        La2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.AbstractC1204v0.g(s3.I, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
