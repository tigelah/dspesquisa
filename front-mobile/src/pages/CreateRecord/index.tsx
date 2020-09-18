import React from 'react';
import { Text,StyleSheet} from 'react-native';
import Header from '../../components/Header';


const CreateRecord = () => {

    return(
        <>
        <Header/>
        <Text style={styles.text}>Hello CreateRecord</Text>
        </>
    );

};

const styles = StyleSheet.create({
    text:{
        color: '#FFF',
        textAlign: 'center',
        fontSize:  40,
        marginTop: 100

    }
});

export default CreateRecord;