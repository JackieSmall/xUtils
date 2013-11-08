package com.lidroid.xutils.db.converter;

import android.database.Cursor;

/**
 * Author: wyouflf
 * Date: 13-11-4
 * Time: 下午10:51
 */
public class ByteArrayColumnConverter implements ColumnConverter<byte[], Object> {
    @Override
    public byte[] getFiledValue(Cursor cursor, int index) {
        return cursor.getBlob(index);
    }

    @Override
    public byte[] getFiledValue(String fieldStringValue) {
        return null;
    }

    @Override
    public Object fieldValue2ColumnValue(byte[] fieldValue) {
        return fieldValue;
    }

    @Override
    public String getColumnDbType() {
        return "BLOB";
    }
}