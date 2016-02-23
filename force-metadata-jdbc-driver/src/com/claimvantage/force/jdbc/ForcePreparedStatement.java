package com.claimvantage.force.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

public class ForcePreparedStatement implements PreparedStatement {

    public ResultSet executeQuery() throws SQLException {
        return new ForceResultSet(new ArrayList<ColumnMap<String, Object>>());
    }

    /*
        Matt is just trying here:
     */
    public void closeOnCompletion() throws SQLException{
    }
    public boolean isCloseOnCompletion() throws SQLException{
        return false;
    }


    /*
        Back to the original Code
     */


    //
    // Not implemented below here
    //

    public void addBatch() throws SQLException {
    }

    public void clearParameters() throws SQLException {

    }

    public boolean execute() throws SQLException {

        return false;
    }

    public int executeUpdate() throws SQLException {

        return 0;
    }

    public ResultSetMetaData getMetaData() throws SQLException {

        return null;
    }

    public ParameterMetaData getParameterMetaData() throws SQLException {

        return null;
    }

    public void setArray(int i, Array x) throws SQLException {

    }

    public void setAsciiStream(int parameterIndex, InputStream x, int length)
            throws SQLException {

    }

    public void setBigDecimal(int parameterIndex, BigDecimal x)
            throws SQLException {

    }

    public void setBinaryStream(int parameterIndex, InputStream x, int length)
            throws SQLException {

    }

    public void setBlob(int i, Blob x) throws SQLException {

    }

    public void setBoolean(int parameterIndex, boolean x) throws SQLException {

    }

    public void setByte(int parameterIndex, byte x) throws SQLException {

    }

    public void setBytes(int parameterIndex, byte[] x) throws SQLException {

    }

    public void setCharacterStream(int parameterIndex, Reader reader, int length)
            throws SQLException {

    }

    public void setClob(int i, Clob x) throws SQLException {

    }

    public void setDate(int parameterIndex, Date x) throws SQLException {

    }

    public void setDate(int parameterIndex, Date x, Calendar cal)
            throws SQLException {

    }

    public void setDouble(int parameterIndex, double x) throws SQLException {

    }

    public void setFloat(int parameterIndex, float x) throws SQLException {

    }

    public void setInt(int parameterIndex, int x) throws SQLException {

    }

    public void setLong(int parameterIndex, long x) throws SQLException {

    }

    public void setNull(int parameterIndex, int sqlType) throws SQLException {

    }

    public void setNull(int paramIndex, int sqlType, String typeName)
            throws SQLException {

    }

    public void setObject(int parameterIndex, Object x) throws SQLException {

    }

    public void setObject(int parameterIndex, Object x, int targetSqlType)
            throws SQLException {

    }

    public void setObject(int parameterIndex, Object x, int targetSqlType,
            int scale) throws SQLException {

    }

    public void setRef(int i, Ref x) throws SQLException {

    }

    public void setShort(int parameterIndex, short x) throws SQLException {

    }

    public void setString(int parameterIndex, String x) throws SQLException {

    }

    public void setTime(int parameterIndex, Time x) throws SQLException {

    }

    public void setTime(int parameterIndex, Time x, Calendar cal)
            throws SQLException {

    }

    public void setTimestamp(int parameterIndex, Timestamp x)
            throws SQLException {

    }

    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
            throws SQLException {

    }

    public void setURL(int parameterIndex, URL x) throws SQLException {

    }

    public void setUnicodeStream(int parameterIndex, InputStream x, int length)
            throws SQLException {

    }

    public void addBatch(String sql) throws SQLException {

    }

    public void cancel() throws SQLException {

    }

    public void clearBatch() throws SQLException {

    }

    public void clearWarnings() throws SQLException {

    }

    public void close() throws SQLException {

    }

    public boolean execute(String sql) throws SQLException {

        return false;
    }

    public boolean execute(String sql, int autoGeneratedKeys)
            throws SQLException {

        return false;
    }

    public boolean execute(String sql, int[] columnIndexes) throws SQLException {

        return false;
    }

    public boolean execute(String sql, String[] columnNames)
            throws SQLException {

        return false;
    }

    public int[] executeBatch() throws SQLException {

        return null;
    }

    public ResultSet executeQuery(String sql) throws SQLException {

        return null;
    }

    public int executeUpdate(String sql) throws SQLException {

        return 0;
    }

    public int executeUpdate(String sql, int autoGeneratedKeys)
            throws SQLException {

        return 0;
    }

    public int executeUpdate(String sql, int[] columnIndexes)
            throws SQLException {

        return 0;
    }

    public int executeUpdate(String sql, String[] columnNames)
            throws SQLException {

        return 0;
    }

    public Connection getConnection() throws SQLException {

        return null;
    }

    public int getFetchDirection() throws SQLException {

        return 0;
    }

    public int getFetchSize() throws SQLException {

        return 0;
    }

    public ResultSet getGeneratedKeys() throws SQLException {

        return null;
    }

    public int getMaxFieldSize() throws SQLException {

        return 0;
    }

    public int getMaxRows() throws SQLException {

        return 0;
    }

    public boolean getMoreResults() throws SQLException {

        return false;
    }

    public boolean getMoreResults(int current) throws SQLException {

        return false;
    }

    public int getQueryTimeout() throws SQLException {

        return 0;
    }

    public ResultSet getResultSet() throws SQLException {

        return null;
    }

    public int getResultSetConcurrency() throws SQLException {

        return 0;
    }

    public int getResultSetHoldability() throws SQLException {

        return 0;
    }

    public int getResultSetType() throws SQLException {

        return 0;
    }

    public int getUpdateCount() throws SQLException {

        return 0;
    }

    public SQLWarning getWarnings() throws SQLException {

        return null;
    }

    public void setCursorName(String name) throws SQLException {

    }

    public void setEscapeProcessing(boolean enable) throws SQLException {

    }

    public void setFetchDirection(int direction) throws SQLException {

    }

    public void setFetchSize(int rows) throws SQLException {

    }

    public void setMaxFieldSize(int max) throws SQLException {

    }

    public void setMaxRows(int max) throws SQLException {

    }

    public void setQueryTimeout(int seconds) throws SQLException {

    }

    public boolean isClosed() throws SQLException {

        return false;
    }

    public void setPoolable(boolean poolable) throws SQLException {

        
    }

    public boolean isPoolable() throws SQLException {

        return false;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {

        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {

        return false;
    }

    public void setRowId(int parameterIndex, RowId x) throws SQLException {

        
    }

    public void setNString(int parameterIndex, String value) throws SQLException {

        
    }

    public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {

        
    }

    public void setNClob(int parameterIndex, NClob value) throws SQLException {

        
    }

    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {

        
    }

    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {

        
    }

    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {

        
    }

    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {

        
    }

    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {

        
    }

    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {

        
    }

    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {

        
    }

    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {

        
    }

    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {

        
    }

    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {

        
    }

    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {

        
    }

    public void setClob(int parameterIndex, Reader reader) throws SQLException {

        
    }

    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {

        
    }

    public void setNClob(int parameterIndex, Reader reader) throws SQLException {

        
    }
}
